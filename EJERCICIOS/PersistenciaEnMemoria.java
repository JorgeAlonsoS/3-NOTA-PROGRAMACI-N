import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Usuario {
    private final String nombre;
    private final String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Correo: " + correo;
    }
}

public class PersistenciaEnMemoria {
    public static void main(String[] args) {
        Map<Integer, Usuario> usuarios = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int idCounter = 1;

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear usuario");
            System.out.println("2. Leer usuarios");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese correo: ");
                    String correo = scanner.nextLine();
                    usuarios.put(idCounter++, new Usuario(nombre, correo));
                    System.out.println("Usuario creado.");
                }
                case 2 -> usuarios.forEach((id, usuario) -> System.out.println("ID: " + id + " | " + usuario));
                case 3 -> {
                    System.out.print("Ingrese el ID del usuario a actualizar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    if (usuarios.containsKey(id)) {
                        System.out.print("Ingrese nuevo nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese nuevo correo: ");
                        String correo = scanner.nextLine();
                        usuarios.put(id, new Usuario(nombre, correo));
                        System.out.println("Usuario actualizado.");
                    } else {
                        System.out.println("ID no encontrado.");
                    }
                }
                case 4 -> {
                    System.out.print("Ingrese el ID del usuario a eliminar: ");
                    int id = scanner.nextInt();
                    if (usuarios.remove(id) != null) {
                        System.out.println("Usuario eliminado.");
                    } else {
                        System.out.println("ID no encontrado.");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}
