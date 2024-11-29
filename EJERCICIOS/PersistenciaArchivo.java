import java.io.*;
import java.util.Scanner;

public class PersistenciaArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Guardar datos
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", true))) {
            writer.write("Nombre: " + nombre + ", Edad: " + edad);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer datos
        System.out.println("Contenido del archivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}