class Contador {
    int valor;

    // Constructor
    Contador(int valor) {
        this.valor = valor;
    }
}

public class ComparacionPasoValorReferencia {
    // Método que intenta modificar el valor del entero
    public static void modificarEntero(int numero) {
        numero = 20; // Modificar el valor local
        System.out.println("Dentro del método (entero), el número es: " + numero);
    }

    // Método que modifica el valor del objeto
    public static void modificarContador(Contador contador) {
        contador.valor = 30; // Modificar el atributo del objeto
        System.out.println("Dentro del método (objeto), el valor es: " + contador.valor);
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Antes de llamar al método (entero), el número es: " + numero);
        modificarEntero(numero); // Llamar al método
        System.out.println("Después de llamar al método (entero), el número es: " + numero); // El valor original no cambia

        Contador contador = new Contador(10);
        System.out.println("Antes de llamar al método (objeto), el valor es: " + contador.valor);
        modificarContador(contador); // Llamar al método
        System.out.println("Después de llamar al método (objeto), el valor es: " + contador.valor); // El valor original cambia
    }
}