public class Concatenador {

    // Método para concatenar dos cadenas
    public static String concatenar(String texto1, String texto2) {
        return texto1 + texto2;
    }

    // Método para concatenar un entero y una cadena
    public static String concatenar(int numero, String texto) {
        return numero + texto;
    }

    public static void main(String[] args) {
        String resultado1 = concatenar("Hola, ", "mundo!"); // Concatenar cadenas
        String resultado2 = concatenar(42, " es la respuesta."); // Concatenar entero y cadena

        System.out.println("Resultado de la concatenación 1: " + resultado1);
        System.out.println("Resultado de la concatenación 2: " + resultado2);
    }
}