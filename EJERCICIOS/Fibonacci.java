public class Fibonacci {
    public static void main(String[] args) {
        long num1 = 0, num2 = 1; // Inicializa los dos primeros números de la sucesión
        int count = 50; // Número de elementos a imprimir

        System.out.print("Los primeros 50 números de la sucesión de Fibonacci: \n");
        System.out.print(num1 + ", " + num2); // Imprime los dos primeros números

        // Usa un ciclo para imprimir los siguientes 48 números
        for (int i = 2; i < count; i++) {
            long nextNum = num1 + num2; // Calcula el siguiente número de la secuencia
            System.out.print(", " + nextNum); // Imprime el siguiente número

            // Actualiza los valores de num1 y num2
            num1 = num2;
            num2 = nextNum;
        }
    }
}
