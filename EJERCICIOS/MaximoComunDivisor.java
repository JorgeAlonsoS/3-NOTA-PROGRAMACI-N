import java.util.Scanner;

public class MaximoComunDivisor {
    // Método para calcular el MCD usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Resto de a dividido por b
            a = temp; // Actualizar a
        }
        return a; // El MCD es el último valor de a
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        int mcd = calcularMCD(num1, num2); // Llamar al método
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
        
        scanner.close();
    } // Cerrar el escáner
}