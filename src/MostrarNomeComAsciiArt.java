import java.util.LinkedList;

public class MostrarNomeComAsciiArt {
    public static void main(String[] args) {

        LinkedList<char[][]> nome = new LinkedList<>();
        // Lista que contem meu nome
        nome.add(letraG());
        nome.add(letraU());
        nome.add(letraI());
        nome.add(letraL());
        nome.add(letraH());
        nome.add(letraE());
        nome.add(letraR());
        nome.add(letraM());
        nome.add(letraE());

        for (char[][] linha : nome) { // para cada uma das letras
            for( int i = 0; i < linha.length; i++) { // para cada uma das linhas da letra
                for( int j = 0; j < linha[i].length;j++) { // para cada uma das colunas da letra
                    char caracter = linha[i][j];
                    System.out.print(caracter);
                }
                System.out.println(); // acabou uma linha da letra
            }
            System.out.println(); // acabou a letra
        }
    }

    public static char[][] letraG() {
        return new char[][]{
                {' ', 'G', 'G', 'G', ' '},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', 'G', 'G', ' '},
                {' ', 'G', 'G', 'G', ' '},
        };
    }

    public static char[][] letraU() {
        return new char[][]{
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {' ', 'U', 'U', 'U', ' '},
        };
    }

    public static char[][] letraI() {
        return new char[][]{
                {' ', 'I', 'I', 'I', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', 'I', 'I', 'I', ' '},
        };
    }

    public static char[][] letraL() {
        return new char[][]{
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', 'L', 'L', 'L', ' '},
        };
    }

    public static char[][] letraH() {
        return new char[][]{
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', 'H', 'H', 'H', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
        };
    }

    public static char[][] letraE() {
        return new char[][]{
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
        };
    }

    public static char[][] letraR() {
        return new char[][]{
                {'R', 'R', 'R', 'R', ' '},
                {'R', ' ', ' ', 'R', ' '},
                {'R', 'R', 'R', 'R', ' '},
                {'R', ' ', 'R', ' ', ' '},
                {'R', ' ', ' ', 'R', ' '},
        };
    }

    public static char[][] letraM() {
        return new char[][]{
                {'M', ' ', ' ', ' ', 'M'},
                {'M', 'M', ' ', 'M', 'M'},
                {'M', ' ', 'M', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'},
        };
    }

}