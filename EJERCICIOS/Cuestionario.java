import java.util.Scanner;

public class Cuestionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definimos las preguntas y respuestas correctas
        String[] preguntas = {
                "¿Cuál es la capital de Francia?\n1. Berlín\n2. París\n3. Madrid",
                "¿Cuánto es 5 + 7?\n1. 10\n2. 12\n3. 14",
                "¿Cuál es el océano más grande del mundo?\n1. Atlántico\n2. Índico\n3. Pacífico"
        };

        int[] respuestasCorrectas = { 2, 2, 3 }; // Respuestas correctas (índices de las respuestas correctas)
        int puntaje = 0; // Inicializar el puntaje

        // Iterar sobre las preguntas
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]);
            System.out.print("Selecciona la respuesta correcta (1, 2 o 3): ");
            int respuestaUsuario = scanner.nextInt();

            // Verificar si la respuesta es correcta
            if (respuestaUsuario == respuestasCorrectas[i]) {
                System.out.println("¡Correcto!\n");
                puntaje++; // Incrementar puntaje
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + respuestasCorrectas[i] + "\n");
            }
        }

        // Mostrar el puntaje final
        System.out.println("Tu puntaje final es: " + puntaje + " de " + preguntas.length);

        scanner.close(); // Cerrar el escáner
    }
}