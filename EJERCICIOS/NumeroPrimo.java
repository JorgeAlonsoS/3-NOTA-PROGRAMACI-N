import java.util.Scanner;

public class NumeroPrimo {
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false; // Números menores o iguales a 1 no son primos
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si se encuentra un divisor, no es primo
            }
        }
        return true; // Si no se encontró divisor, es primo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        boolean primo = esPrimo(numero); // Llamar al método
        if (primo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        
        scanner.close(); // Cerrar el escáner
    }
}