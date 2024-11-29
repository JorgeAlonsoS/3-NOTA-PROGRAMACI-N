public class CalcularPotencia {
    public static void main(String[] args) {
        System.out.println("Resultado: " + potencia(2, 10)); // 2^10
    }

    public static long potencia(int base, int exponente) {
        long resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}

