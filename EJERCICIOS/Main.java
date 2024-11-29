import java.io.*;

class Empleado implements Serializable {
    private String nombre;
    private int id;
    private double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre='" + nombre + '\'' + ", id=" + id + ", salario=" + salario + '}';
    }
}

public class Main {
    public static void serializarEmpleado(Empleado empleado) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleado.ser"))) {
            oos.writeObject(empleado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Empleado deserializarEmpleado() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleado.ser"))) {
            return (Empleado) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Perez", 101, 50000);
        serializarEmpleado(empleado);
        Empleado empleadoDeserializado = deserializarEmpleado();
        System.out.println(empleadoDeserializado);
    }
}