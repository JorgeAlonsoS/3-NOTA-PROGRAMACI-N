import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario un número entero
        System.out.print("Ingresa un número entero para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Inicializamos el contador
        int i = 1;

        // Usamos un bucle while para mostrar la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");
        while (i <= 10) {
            int resultado = numero * i; // Calcular el resultado
            System.out.println(numero + " x " + i + " = " + resultado);
            i++; // Incrementar el contador
        }

        scanner.close(); // Cerrar el escáner
    }
}