import java.util.Scanner;

// Excepción personalizada
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            validarEdad(edad);

            System.out.println("Edad válida: " + edad + " años.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Método para validar la edad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
    }
}
