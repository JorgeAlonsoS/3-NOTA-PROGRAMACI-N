import java.util.Scanner;

public class EstadisticasNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int suma = 0;

        System.out.println("Ingrese números (negativo para terminar):");
        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) break; // Detener el ciclo si es negativo
            suma += numero;
            contador++;
        }

        double promedio = contador > 0 ? (double) suma / contador : 0;

        System.out.println("Cantidad de números ingresados: " + contador);
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
