public class Ejercicio4 {

    // Método que incrementa el valor en 1 y lo retorna
    public static int incrementar(int x) {
        x += 1; // Incrementar el valor
        return x; // Retornar el valor modificado
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Antes de incrementar: x = " + x);
        x = incrementar(x); // Usar el valor retornado
        System.out.println("Después de incrementar: x = " + x); // El valor se ha modificado
    }
}