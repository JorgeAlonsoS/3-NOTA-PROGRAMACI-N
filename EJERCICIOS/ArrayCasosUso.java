public class ArrayCasosUso {
    public static void main(String[] args) {
        int[] numeros = {34, 12, 56, 78, 9, 23};
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
