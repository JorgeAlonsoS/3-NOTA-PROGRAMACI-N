public class Ejercicio_1_Fizz_Buzz {

    public static void main(String[] args) {
        // Recorre los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Si es múltiplo de 3 y de 5, imprime "fizzbuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            // Si es múltiplo de 3, imprime "fizz"
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            // Si es múltiplo de 5, imprime "buzz"
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            // Si no es múltiplo de 3 ni de 5, imprime el número
            else {
                System.out.println(i);
            }
        }
    }
}
