public class BanderasArubaMalta {

    public static void main(String[] args) {

    }

    public static void DibujarBandera(int[][] bandera) {
        for (int i = 0; i < bandera.length; i++) {
            for (int j = 0; j < bandera[0].length; j++) {
                if (bandera[i][j] == 1)         System.out.print(ConsoleColors.RED_BACKGROUND + " 1 ");
                else if (bandera[i][j] == 2)    System.out.print(ConsoleColors.BLUE_BACKGROUND + " 2 ");
                else if (bandera[i][j] == 3)    System.out.print(ConsoleColors.WHITE_BACKGROUND + " 3 ");
                else if (bandera[i][j] == 4)    System.out.print(ConsoleColors.YELLOW_BACKGROUND + " 4 ");
            }
            System.out.println(ConsoleColors.RESET);
        }

        System.out.println();
    }

    public static int[][] BanderaMalta() {

        int[][] bandera = new int[18][26];
        bandera = PintarColumna(bandera, 0, 13, 3);
        bandera = PintarColumna(bandera, 13, 26, 1);
        bandera = PintarCruz(bandera);

        return bandera;
    }

    public static int[][] BanderaAruba() {
        int[][] bandera = new int[18][26];
        bandera = PintarColumna(bandera, 0, 26, 2);
        bandera = PintarFila(bandera, 13, 14, 4);
        bandera = PintarFila(bandera, 15, 16, 4);
        bandera = PintarEstrella(bandera, 1);

        return bandera;
    }

    public static int[][] PintarColumna(int[][] bandera, int inicio, int fin, int color) {
        for (int i = 0; i < bandera.length; i++) {
            for (int j = inicio; j < fin; j++) {
                bandera[i][j] = color;
            }
        }

        return bandera;
    }

    public static int[][] PintarFila(int[][] bandera, int inicio, int fin, int color) {
        for (int i = inicio; i < fin; i++) {
            for (int j = 0; j < bandera[0].length; j++) {
                bandera[i][j] = color;
            }
        }

        return bandera;
    }

    public static int[][] PintarCruz(int[][] bandera) {
        bandera[1][2] = 1;
        bandera[1][3] = 1;
        bandera[1][4] = 1;

        bandera[2][1] = 1;
        bandera[2][2] = 1;
        bandera[2][4] = 1;
        bandera[2][5] = 1;

        bandera[3][1] = 1;
        bandera[3][5] = 1;

        bandera[4][1] = 1;
        bandera[4][2] = 1;
        bandera[4][4] = 1;
        bandera[4][5] = 1;

        bandera[5][2] = 1;
        bandera[5][3] = 1;
        bandera[5][4] = 1;

        return bandera;
    }

    public static int[][] PintarEstrella(int[][] bandera, int color) {
        bandera[1][3] = color;
        bandera[2][2] = color;
        bandera[2][3] = color;
        bandera[2][4] = color;
        bandera[3][1] = color;
        bandera[3][2] = color;
        bandera[3][3] = color;
        bandera[3][4] = color;
        bandera[3][5] = color;
        bandera[4][2] = color;
        bandera[4][3] = color;
        bandera[4][4] = color;
        bandera[5][3] = color;

        return bandera;
    }
}

class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
}
