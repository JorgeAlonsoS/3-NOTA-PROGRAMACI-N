import java.io.*;

public class LecturaArchivo {
    public static void main(String[] args) {
        String rutaArchivo = "archivo.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe. Ruta: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error: Ocurrió un problema al leer el archivo.");
        }
    }
}
