import java.util.Scanner;

public class DivisionConExcepciones {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Ingrese el numerador: ");
                int numerador = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese el denominador: ");
                int denominador = Integer.parseInt(scanner.nextLine());

                int resultado = numerador / denominador;

                System.out.println("El resultado es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese números enteros.");
            } finally {
                System.out.println("Operación finalizada.");
            }
        }
    }
}
