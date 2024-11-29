import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 1, 9, 3, 7);
        List<Integer> ordenados = numeros.stream()
                .sorted((a, b) -> b - a) // Orden descendente
                .collect(Collectors.toList());

        System.out.println("Lista ordenada: " + ordenados);
    }
}
