import java.util.Scanner;

public class SumaYPromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double suma = 0;
        int contadorNotas = 0;

        System.out.println("Ingresa las notas de los estudiantes (termina con -1):");

        while (true) {
            nota = scanner.nextDouble();
            if (nota == -1) {
                break; // Terminar si el usuario ingresa -1
            }
            suma += nota; // Acumular la suma de las notas
            contadorNotas++; // Incrementar el contador de notas
        }

        if (contadorNotas > 0) {
            double promedio = suma / contadorNotas; // Calcular el promedio
            System.out.println("Suma total de notas: " + suma);
            System.out.println("Promedio de notas: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }

        scanner.close(); // Cerrar el escáner
    }
}