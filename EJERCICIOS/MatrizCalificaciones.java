public class MatrizCalificaciones {
    public static void main(String[] args) {
        int[][] calificaciones = {
            {85, 90, 88},
            {78, 81, 86},
            {92, 89, 95}
        };

        System.out.println("Calificaciones de los estudiantes:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}

