import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int n = scanner.nextInt();

        System.out.println("Números pares desde 1 hasta " + n + ":");
        
        // Usamos un bucle for para iterar desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue; // Saltar los números impares
            }
            System.out.println(i); // Mostrar el número par
        }

        scanner.close(); // Cerrar el escáner
    }
}