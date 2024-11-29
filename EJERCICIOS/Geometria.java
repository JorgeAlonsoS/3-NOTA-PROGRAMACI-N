public class Geometria {
        // Definimos constantes para los valores mágicos
        private static final double PI = 3.14159; // Valor mágico para PI
        private static final int RADIO_CIRCULO = 5; // Valor mágico para el radio del círculo
        private static final int LADO_CUADRADO = 4; // Valor mágico para el lado del cuadrado
    
        public static void main(String[] args) {
            // Cálculo del área y perímetro de un círculo
            double areaCirculo = calcularAreaCirculo(RADIO_CIRCULO);
            double perimetroCirculo = calcularPerimetroCirculo(RADIO_CIRCULO);
    
            // Cálculo del área y perímetro de un cuadrado
            double areaCuadrado = calcularAreaCuadrado(LADO_CUADRADO);
            double perimetroCuadrado = calcularPerimetroCuadrado(LADO_CUADRADO);
    
            // Mostrar resultados
            System.out.println("Círculo:");
            System.out.println("Área: " + areaCirculo);
            System.out.println("Perímetro: " + perimetroCirculo);
    
            System.out.println("\nCuadrado:");
            System.out.println("Área: " + areaCuadrado);
            System.out.println("Perímetro: " + perimetroCuadrado);
        }
    
        // Método para calcular el área de un círculo
        private static double calcularAreaCirculo(int radio) {
            return PI * radio * radio;
        }
    
        // Método para calcular el perímetro de un círculo
        private static double calcularPerimetroCirculo(int radio) {
            return 2 * PI * radio;
        }
    
        // Método para calcular el área de un cuadrado
        private static double calcularAreaCuadrado(int lado) {
            return lado * lado;
        }
    
        // Método para calcular el perímetro de un cuadrado
        private static double calcularPerimetroCuadrado(int lado) {
            return 4 * lado;
        }
    }

