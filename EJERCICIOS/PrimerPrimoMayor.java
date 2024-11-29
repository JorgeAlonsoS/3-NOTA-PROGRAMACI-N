public class PrimerPrimoMayor {
    public static void main(String[] args) {
        int numero = 101; // Iniciar en 101
        while (true) {
            if (esPrimo(numero)) {
                System.out.println("El primer número primo mayor que 100 es: " + numero);
                break; // Salir al encontrar el primer primo
            }
            numero++;
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) { // Optimización: solo hasta la raíz cuadrada
            if (num % i == 0) return false;
        }
        return true;
    }
}
