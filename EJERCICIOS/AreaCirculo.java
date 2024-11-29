import java.util.Scanner;

public class AreaCirculo {
    // Método para calcular el área del círculo
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2); // Fórmula: π * r^2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        double area = calcularArea(radio); // Llamar al método
        System.out.println("El área del círculo es: " + area);
        
        scanner.close(); // Cerrar el escáner
    }
}