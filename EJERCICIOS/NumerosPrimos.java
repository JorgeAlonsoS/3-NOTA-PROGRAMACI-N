public class NumerosPrimos {

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        // Un número menor que 2 no es primo
        if (num < 2) {
            return false;
        }

        // Verificar si el número tiene divisores entre 2 y la raíz cuadrada de num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // Si el residuo es 0, no es primo
                return false;
            }
        }
        return true; // Si no tiene divisores, es primo
    }

    public static void main(String[] args) {
        System.out.println("Los números primos entre 1 y 100 son:");

        // Imprime los números primos entre 1 y 100
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " "); // Imprime el número si es primo
            }
        }
    }
}
