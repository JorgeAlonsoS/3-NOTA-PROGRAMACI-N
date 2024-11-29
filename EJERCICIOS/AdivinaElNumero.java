import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroObjetivo = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        int intentos = 0;
        int adivinanza;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Adivina un número entre 1 y 100:");

        while (true) {
            System.out.print("Ingresa tu adivinanza: ");
            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < 1 || adivinanza > 100) {
                System.out.println("Por favor, ingresa un número entre 1 y 100.");
                continue; // Pedir nuevamente la entrada si el número está fuera de rango
            }

            if (adivinanza == numeroObjetivo) {
                System.out.println("¡Correcto! Adivinaste el número en " + intentos + " intentos.");
                break; // Salir del bucle si se adivina correctamente
            } else if (adivinanza < numeroObjetivo) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número es menor. Intenta de nuevo.");
            }
        }

        scanner.close(); // Cerrar el escáner
    }
}