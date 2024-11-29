import java.util.Scanner;

public class CelsiusAFahrenheit {
    // Método para convertir Celsius a Fahrenheit
    public static double convertirACelsius(double celsius) {
        return (celsius * 9/5) + 32; // Fórmula: (C * 9/5) + 32
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = convertirACelsius(celsius); // Llamar al método
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        
        scanner.close(); // Cerrar el escáner
    }
}