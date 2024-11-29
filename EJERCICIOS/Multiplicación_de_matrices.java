public class Multiplicación_de_matrices {
    public static void main(String[] args) {
        int[][] A = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] B = {
                { 5, 6 },
                { 7, 8 }
        };

        int[][] C = new int[2][2]; // Matriz para almacenar el resultado

        // Multiplicación de matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0; // Inicializamos el elemento C[i][j] a 0 antes de sumar
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j]; // Suma de productos
                }
            }
        }

        // Imprimir el resultado
        System.out.println("Resultado de la multiplicación de matrices: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}