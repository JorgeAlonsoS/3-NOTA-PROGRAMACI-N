public class AreaCalculator {

    // Método para calcular el área de un rectángulo
    public static double calcularArea(double ancho, double alto) {
        return ancho * alto;
    }

    // Método para calcular el área de un círculo
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        double areaRectangulo = calcularArea(5.0, 10.0); // Área de un rectángulo
        double areaCirculo = calcularArea(7.0); // Área de un círculo

        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Área del círculo: " + areaCirculo);
    }
}