public class Ejercicio5 {

    // Método que intenta modificar una cadena
    public static void modificarCadena(String texto) {
        texto = "Cadena Modificada"; // Intentar cambiar el valor de la cadena
        System.out.println("Dentro del método: texto = " + texto);
    }

    public static void main(String[] args) {
        String miCadena = "Cadena Original";
        System.out.println("Antes de modificar: miCadena = " + miCadena);
        modificarCadena(miCadena); // Llamar al método
        System.out.println("Después de modificar: miCadena = " + miCadena); // El valor original no cambia
    }
}