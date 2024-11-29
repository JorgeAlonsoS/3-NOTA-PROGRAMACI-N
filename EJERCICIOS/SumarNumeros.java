import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int n = scanner.nextInt();

        // Inicializamos la suma
        int suma = 0;

        // Usamos un bucle for para sumar los números del 1 al n
        for (int i = 1; i <= n; i++) {
            suma += i; // Sumar el número actual
        }

        // Mostrar el resultado
        System.out.println("La suma de los números del 1 al " + n + " es: " + suma);

        scanner.close(); // Cerrar el escáner
    }
}