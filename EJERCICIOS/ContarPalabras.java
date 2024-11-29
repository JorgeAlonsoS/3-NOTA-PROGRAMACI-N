import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una oración:");
        String[] palabras = scanner.nextLine().split(" ");

        Map<String, Integer> contador = new HashMap<>();
        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        System.out.println("Frecuencia de palabras:");
        contador.forEach((palabra, frecuencia) -> System.out.println(palabra + ": " + frecuencia));
    }
}
