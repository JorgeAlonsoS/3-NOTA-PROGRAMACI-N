public class PasoPorValor {
    // Método que intenta modificar el valor del entero
    public static void modificarValor(int numero) {
        numero = 10; // Modificar el valor local
        System.out.println("Dentro del método, el número es: " + numero);
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Antes de llamar al método, el número es: " + numero);
        modificarValor(numero); // Llamar al método
        System.out.println("Después de llamar al método, el número es: " + numero); // El valor original no cambia
    }
}