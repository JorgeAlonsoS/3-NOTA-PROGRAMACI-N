import java.util.*;
import java.util.stream.Collectors;

public class FrecuenciaPalabras {
    public static void main(String[] args) {
        String texto = "hola mundo hola programacion mundo hola";
        String[] palabras = texto.split(" ");

        Map<String, Long> frecuencia = Arrays.stream(palabras)
                .collect(Collectors.groupingBy(palabra -> palabra, Collectors.counting()));

        Map<String, Long> repetidas = frecuencia.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filtrar palabras repetidas
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Frecuencia completa: " + frecuencia);
        System.out.println("Palabras repetidas: " + repetidas);
    }
}
