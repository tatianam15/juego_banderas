import java.util.Scanner;

public class BanderasArubaMalta {
    //Variables globales 

    static String[] opcionesAruba = new String[] { "Aruba", "El Salvador", "Nicaragua", "Aruba", "Colombia"};//Arreglo opciones aruba, en las primeras posiciones está la respuesta correcta, static string para definir la cadena de caracteres 
    static String[] opcionesMalta = new String[] { "Malta", "Polonia", "Malta", "Alemania", "Austria"}; //Arreglo opciones malta, en las primeras posiciones está la respuesta correcta 
    static String[][] opcionesJuego = new String[][] { opcionesAruba, opcionesMalta }; // Arreglo de los arreglos de opciones para las banderas que se tienen. 

    static int[][] banderaAruba = BanderaAruba(); //Matriz, Arreglo de dos dimensiones para la bandera Aruba 
    static int[][] otraBandera = OtraBandera(); // Matriz, arreglo de dos dimensiones para la bandera de Malta 
    static int[][][] banderas = new int[][][] { banderaAruba, otraBandera }; // Arreglo que contiene las banderas (arreglo de matrices)

    
    // Variable Scanner para leer entradas del usuario
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Ciclo para recorrer las opciones de bandera que hay
        for (int i = 0; i < opcionesJuego.length; i++) { 
          DibujarBandera(banderas[i]);
          MenuOpciones(opcionesJuego[i], opcionesJuego[i][0], entrada);
        }

        entrada.close();
    }

    public static void DibujarBandera(int[][] bandera) {
        /*
         * Este método recibe como entrada una matriz, que contiene los colores de una bandera organizados por
         * filas y columnas. No tiene salidas, imprime en la  consola la bandera que se pasó como argumento.
         */

        for (int i = 0; i < bandera.length; i++) {
            for (int j = 0; j < bandera[0].length; j++) {
                if (bandera[i][j] == 1)         System.out.print(ConsoleColors.RED_BACKGROUND+ " 1 ");
                else if (bandera[i][j] == 2)    System.out.print(ConsoleColors.BLUE_BACKGROUND + " 2 ");
                else if (bandera[i][j] == 3)    System.out.print(ConsoleColors.WHITE_BACKGROUND + " 3 ");
                else if (bandera[i][j] == 4)    System.out.print(ConsoleColors.YELLOW_BACKGROUND + " 4 ");
                
            }
            System.out.println(ConsoleColors.RESET);
        }

        System.out.println();
    }

    public static int[][] BanderaAruba() {
         /*
         * Este método no recibe entradas. Devuelve una matriz que contiene los códigos de colores
         * para la bandera de Aruba.
         */
        int[][] bandera = new int[18][26];
        bandera = PintarColumna(bandera, 0, 26, 2);
        bandera = PintarFila(bandera, 13, 14, 4);
        bandera = PintarFila(bandera, 15, 16, 4);
        bandera = PintarEstrella(bandera, 1);

        return bandera;
    }

    public static int[][] OtraBandera() {
         /*
         * Este método no recibe entradas. Devuelve una matriz que contiene los códigos de colores
         * para la bandera de Malta.
         */
        int[][] bandera = new int[18][26];
        bandera = PintarColumna(bandera, 0, 13, 3);
        bandera = PintarColumna(bandera, 13, 26, 1);
        bandera = PintarCruz(bandera, 1);

        return bandera;
    }

    public static int[][] PintarColumna(int[][] bandera, int inicio, int fin, int color) {
        /*
         * Este método recibe como parámetros una matriz con los valores de una bandera, los enteros de "inicio" y "fin",
         * que indican las columnas de la bandera que se quieren pintar, y el entero "color", que es el color con el
         * que se quiere pintar la columna.
         *
         * Tiene como salida una matriz de la bandera con las columnas ya pintadas.
         */
        for (int i = 0; i < bandera.length; i++) {
            for (int j = inicio; j < fin; j++) {
                bandera[i][j] = color;
            }
        }

        return bandera;
    }

    public static int[][] PintarFila(int[][] bandera, int inicio, int fin, int color) {
         /*
         * Este método recibe como parámetros una matriz con los valores de una bandera, los enteros de "inicio" y "fin",
         * que indican las filas de la bandera que se quieren pintar, y el entero "color", que es el color con el
         * que se quiere pintar la columna.
         *
         * Tiene como salida una matriz de la bandera con las columnas ya pintadas.
         */
        for (int i = inicio; i < fin; i++) {
            for (int j = 0; j < bandera[0].length; j++) {
                bandera[i][j] = color;
            }
        }

        return bandera;
    }

    public static int[][] PintarEstrella(int[][] bandera, int color) {
         /*
         * Método que recibe como entrada una bandera y un color. Devuelve una bandera con una estrella pintada
         * en la esquina superior izquierda, del color pasado como parámetro.
         */
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

    public static int[][] PintarCruz(int[][] bandera, int color) {
         /*
         * Método que recibe como entrada una bandera. Devuelve una bandera con una cruz pintada
         * en la esquina superior izquierda, del color "1".
         */
        bandera[1][2] = color;
        bandera[1][3] = color;
        bandera[1][4] = color;

        bandera[2][1] = color;
        bandera[2][2] = color;
        bandera[2][4] = color;
        bandera[2][5] = color;

        bandera[3][1] = color;
        bandera[3][5] = color;

        bandera[4][1] = color;
        bandera[4][2] = color;
        bandera[4][4] = color;
        bandera[4][5] = color;

        bandera[5][2] = color;
        bandera[5][3] = color;
        bandera[5][4] = color;

        return bandera;
    }

    public static void MenuOpciones(String opciones[], String opcionCorrecta, Scanner in) {
         /*
         * Método que recibe como entrada un arreglo de String, "opciones", que contiene las
         * opciones para una bandera, "opcionCorrecta", que es el nombre de la bandera correcta, y
         * un Scanner para leer entradas del usuario en el juego.
         *
         * No tiene salidas. Presenta un menú de opciones al usuario para seleccionar el país correcto de la
         * bandera que se presenta.
         */

        System.out.println(ConsoleColors.RESET + "\n¿Qué país es?");
         // Ciclo para imprimir las opciones del juego
        for (int i = 1; i < opciones.length; i++) {
            System.out.println((i) + ". " + opciones[i]);
        }
         // Lineas para leer la entrada de usuario usando Scanner
        System.out.print("Seleccione su opción: ");
        int opcion = in.nextInt(); // para leer el dato tipo int 
        // Se compara  si la elección del usuario es correcta
        if (opciones[opcion].equals(opcionCorrecta)) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto");
        }

    }
}

