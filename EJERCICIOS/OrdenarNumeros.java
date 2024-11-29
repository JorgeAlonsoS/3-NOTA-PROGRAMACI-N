import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese números (0 para terminar):");
        int numero;
        while ((numero = scanner.nextInt()) != 0) {
            numeros.add(numero);
        }

        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);
    }
}
