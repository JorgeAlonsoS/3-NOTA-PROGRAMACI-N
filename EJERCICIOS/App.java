// Capa de datos

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private int id;
    private String nombre;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{id=" + id + ", nombre='" + nombre + "'}";
    }
}

// Capa de lógica
class EstudianteDAO {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(int id) {
        estudiantes.removeIf(est -> est.getId() == id);
    }

    public Estudiante buscarEstudiante(int id) {
        return estudiantes.stream().filter(est -> est.getId() == id).findFirst().orElse(null);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }
}

// Capa de presentación
public class App {
    public static void main(String[] args) {
        EstudianteDAO dao = new EstudianteDAO();

        dao.agregarEstudiante(new Estudiante(1, "Ana"));
        dao.agregarEstudiante(new Estudiante(2, "Luis"));

        System.out.println("Lista de estudiantes:");
        dao.listarEstudiantes().forEach(System.out::println);

        System.out.println("Buscar estudiante con ID 1:");
        System.out.println(dao.buscarEstudiante(1));

        System.out.println("Eliminar estudiante con ID 2:");
        dao.eliminarEstudiante(2);
        dao.listarEstudiantes().forEach(System.out::println);
    }
}
