import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1; // Acumulador para el factorial

            for (int i = 1; i <= numero; i++) {
                factorial *= i; // Acumular el producto
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close(); // Cerrar el escáner
    }
}