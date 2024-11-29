public class NumeroPerfecto {
    public static void main(String[] args) {
        int numero = 28; // Cambiar para probar otros números
        int sumaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) { // Optimización: solo hasta la mitad del número
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
}
