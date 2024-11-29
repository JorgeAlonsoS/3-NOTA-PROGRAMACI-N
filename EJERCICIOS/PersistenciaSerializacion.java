import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Producto implements Serializable {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio;
    }
}

public class PersistenciaSerializacion {
    public static void main(String[] args) {
        String archivo = "productos.dat";

        // Crear y guardar productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Laptop", 1200.99));
        productos.add(new Producto(2, "Teléfono", 799.49));
        productos.add(new Producto(3, "Tablet", 450.89));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(productos);
            System.out.println("Productos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los productos.");
        }

        // Leer y mostrar productos
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            List<Producto> productosLeidos = (List<Producto>) ois.readObject();
            System.out.println("Productos recuperados:");
            productosLeidos.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer los productos.");
        }
    }
}
