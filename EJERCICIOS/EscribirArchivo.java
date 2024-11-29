import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("archivo.txt")) {
            writer.write("Hola, este es un archivo de texto.");
            System.out.println("Archivo escrito exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }
}
