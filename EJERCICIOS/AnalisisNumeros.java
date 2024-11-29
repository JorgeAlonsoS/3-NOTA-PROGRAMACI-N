import java.util.Scanner;

public class AnalisisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario cuántos números quiere ingresar
        System.out.print("¿Cuántos números quieres ingresar? ");
        int cantidad = scanner.nextInt();

        // Creamos un array para almacenar los números
        double[] numeros = new double[cantidad];

        // Ingresar los números
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular suma, promedio, máximo y mínimo
        double suma = 0;
        double maximo = numeros[0];
        double minimo = numeros[0];

        for (double numero : numeros) {
            suma += numero; // Sumar el número
            if (numero > maximo) {
                maximo = numero; // Encontrar el máximo
            }
            if (numero < minimo) {
                minimo = numero; // Encontrar el mínimo
            }
        }

        double promedio = suma / cantidad; // Calcular el promedio

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Número máximo: " + maximo);
        System.out.println("Número mínimo: " + minimo);

        scanner.close(); // Cerrar el escáner
    }
}