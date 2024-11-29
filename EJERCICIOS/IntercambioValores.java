public class IntercambioValores {

    // Método que intenta intercambiar los valores de dos enteros
    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del método: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("Antes de intercambiar: x = " + x + ", y = " + y);
        intercambiar(x, y); // Llamar al método
        System.out.println("Después de intercambiar: x = " + x + ", y = " + y); // Los valores originales no cambian
    }
}