class Persona {
    String nombre;

    // Constructor
    Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class PasoPorReferencia {
    // Método que modifica el nombre de la persona
    public static void modificarNombre(Persona persona) {
        persona.nombre = "Juan"; // Modificar el atributo del objeto
        System.out.println("Dentro del método, el nombre es: " + persona.nombre);
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Ana");
        System.out.println("Antes de llamar al método, el nombre es: " + persona.nombre);
        modificarNombre(persona); // Llamar al método
        System.out.println("Después de llamar al método, el nombre es: " + persona.nombre); // El valor original cambia
    }
}