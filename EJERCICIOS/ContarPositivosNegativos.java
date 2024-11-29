import java.util.Scanner;

public class ContarPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        System.out.println("Ingresa una serie de números (termina con 0):");

        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break; // Terminar si el usuario ingresa 0
            }
            if (numero > 0) {
                contadorPositivos++; // Incrementar contador de positivos
            } else {
                contadorNegativos++; // Incrementar contador de negativos
            }
        }

        System.out.println("Números positivos: " + contadorPositivos);
        System.out.println("Números negativos: " + contadorNegativos);

        scanner.close(); // Cerrar el escáner
    }
}