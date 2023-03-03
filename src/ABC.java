public class ABC {
    public static void main(String[] args) {
        char[][][] alphabet = {letraA(), letraB(), letraC(), letraD(), letraE(),
                letraF(), letraG(), letraH(), letraI(), letraJ(),
                letraK(), letraL(), letraM(), letraN(), letraO(),
                letraP(), letraQ(), letraR(), letraS(), letraT(),
                letraU(), letraV(), letraW(), letraX(), letraY(),
                letraZ()};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                char[][] letter = alphabet[j];
                for (int k = 0; k < letter[i].length; k++) {
                    System.out.print(letter[i][k] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static char[][] letraA() {
        return new char[][]{
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
        };
    }

    public static char[][] letraB() {
        return new char[][]{
                {'B', 'B', 'B', 'B', ' '},
                {'B', ' ', ' ', ' ', 'B'},
                {'B', 'B', 'B', 'B', ' '},
                {'B', ' ', ' ', ' ', 'B'},
                {'B', 'B', 'B', 'B', ' '},
        };
    }

    public static char[][] letraC() {
        return new char[][]{
                {' ', 'C', 'C', 'C', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {' ', 'C', 'C', 'C', ' '},
        };
    }
    public static char[][] letraD() {
        return new char[][]{
                {'D', 'D', 'D', ' ', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', ' ', ' ', ' ', 'D'},
                {'D', ' ', ' ', 'D', ' '},
                {'D', 'D', 'D', ' ', ' '},
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

    public static char[][] letraF() {
        return new char[][]{
                {'F', 'F', 'F', 'F', 'F'},
                {'F', ' ', ' ', ' ', ' '},
                {'F', 'F', 'F', 'F', ' '},
                {'F', ' ', ' ', ' ', ' '},
                {'F', ' ', ' ', ' ', ' '},
        };
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

    public static char[][] letraH() {
        return new char[][]{
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', 'H', 'H', 'H', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
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

    public static char[][] letraJ() {
        return new char[][]{
                {' ', ' ', ' ', 'J', ' '},
                {' ', ' ', ' ', 'J', ' '},
                {' ', ' ', ' ', 'J', ' '},
                {'J', ' ', ' ', 'J', ' '},
                {' ', 'J', 'J', ' ', ' '},
        };
    }

    public static char[][] letraK() {
        return new char[][]{
                {'K', ' ', ' ', 'K', ' '},
                {'K', ' ', 'K', ' ', ' '},
                {'K', 'K', ' ', ' ', ' '},
                {'K', ' ', 'K', ' ', ' '},
                {'K', ' ', ' ', 'K', ' '},
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

    public static char[][] letraM() {
        return new char[][]{
                {'M', ' ', ' ', ' ', 'M'},
                {'M', 'M', ' ', 'M', 'M'},
                {'M', ' ', 'M', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'},
        };
    }

    public static char[][] letraN() {
        return new char[][]{
                {'N', ' ', ' ', ' ', 'N'},
                {'N', 'N', ' ', ' ', 'N'},
                {'N', ' ', 'N', ' ', 'N'},
                {'N', ' ', ' ', 'N', 'N'},
                {'N', ' ', ' ', ' ', 'N'},
        };
    }

    public static char[][] letraO() {
        return new char[][]{
                {' ', 'O', 'O', 'O', ' '},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {' ', 'O', 'O', 'O', ' '},
        };
    }

    public static char[][] letraP() {
        return new char[][]{
                {'P', 'P', 'P', 'P', ' '},
                {'P', ' ', ' ', 'P', ' '},
                {'P', 'P', 'P', 'P', ' '},
                {'P', ' ', ' ', ' ', ' '},
                {'P', ' ', ' ', ' ', ' '},
        };
    }

    public static char[][] letraQ() {
        return new char[][]{
                {' ', 'Q', 'Q', 'Q', ' '},
                {'Q', ' ', ' ', ' ', 'Q'},
                {'Q', ' ', ' ', ' ', 'Q'},
                {'Q', ' ', 'Q', 'Q', 'Q'},
                {' ', 'Q', 'Q', 'Q', 'Q'},
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

    public static char[][] letraS() {
        return new char[][]{
                {' ', 'S', 'S', 'S', ' '},
                {'S', ' ', ' ', ' ', ' '},
                {' ', 'S', 'S', 'S', ' '},
                {' ', ' ', ' ', ' ', 'S'},
                {' ', 'S', 'S', 'S', ' '},
        };
    }

    public static char[][] letraT() {
        return new char[][]{
                {'T', 'T', 'T', 'T', 'T'},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
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

    public static char[][] letraV() {
        return new char[][]{
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {' ', 'V', ' ', 'V', ' '},
                {' ', ' ', 'V', ' ', ' '},
                {' ', ' ', 'V', ' ', ' '},
        };
    }

    public static char[][] letraW() {
        return new char[][]{
                {'W', ' ', ' ', ' ', 'W'},
                {'W', ' ', ' ', ' ', 'W'},
                {'W', ' ', 'W', ' ', 'W'},
                {'W', 'W', ' ', 'W', 'W'},
                {' ', ' ', ' ', ' ', ' '},
        };
    }

    public static char[][] letraX() {
        return new char[][]{
                {'X', ' ', ' ', ' ', 'X'},
                {' ', 'X', ' ', 'X', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', 'X', ' '},
                {'X', ' ', ' ', ' ', 'X'},
        };
    }

    public static char[][] letraY() {
        return new char[][]{
                {'Y', ' ', ' ', ' ', 'Y'},
                {' ', 'Y', ' ', 'Y', ' '},
                {' ', ' ', 'Y', ' ', ' '},
                {' ', ' ', 'Y', ' ', ' '},
                {' ', ' ', 'Y', ' ', ' '},
        };
    }

    public static char[][] letraZ() {
        return new char[][]{
                {'Z', 'Z', 'Z', 'Z', 'Z'},
                {' ', ' ', ' ', ' ', 'Z'},
                {' ', ' ', ' ', 'Z', ' '},
                {' ', ' ', 'Z', ' ', ' '},
                {' ', 'Z', 'Z', 'Z', 'Z'},
        };
    }


}
