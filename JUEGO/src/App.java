import java.util.Random;
import java.util.Scanner;

// Clase base para todos los personajes
class Personaje {

    String nombre; // Nombre del personaje
    int fuerza; // La fuerza define el poder de ataque del personaje
    int velocidad; // La velocidad determina quién actúa primero en combate
    int vida_hp; // La vida actual del personaje
    int vidaMaxima; // La vida máxima que puede tener el personaje
    boolean defendiendo = false; // Indica si el personaje está defendiendo para reducir daño
    int contRecuperar = 3; // Cantidad de veces que el personaje puede recuperar vida

    // Constructor que inicializa los atributos del personaje
    public Personaje(String nombre, int fuerza, int velocidad, int vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
        this.vidaMaxima = vida_hp; // La vida máxima se establece igual que la vida inicial
    }

    // Muestra la información actual del personaje en colores y con emojis
    public void mostrarInfo() {
        System.out.println("\u001B[34m👤 Nombre: " + nombre); // Muestra el nombre del personaje
        System.out.println("\u001B[31m💪 Fuerza: " + fuerza); // Muestra la fuerza del personaje
        System.out.println("\u001B[32m⚡ Velocidad: " + velocidad); // Muestra la velocidad del personaje
        System.out.println("\u001B[33m❤️ Vida: " + vida_hp + "/" + vidaMaxima); // Muestra la vida actual y máxima del personaje
        System.out.println("\u001B[35m🩹 Recuperaciones restantes: " + contRecuperar + "\u001B[0m"); // Muestra cuántas recuperaciones le quedan
        imprimirSeparador(); // Llama a la función para imprimir un separador visual
    }

    // El personaje entra en modo de defensa, reduciendo el daño recibido
    public void defender() {
        System.out.println("\u001B[36m" + nombre + " se está defendiendo!\u001B[0m"); // Informa que el personaje está en defensa
        defendiendo = true; // Marca que el personaje está en modo defensivo
    }

    // El personaje realiza un ataque a otro personaje
    public void atacar(Personaje enemigo) {
        enemigo.recibirDaño(this.fuerza); // El enemigo recibe daño basado en la fuerza del atacante
    }

    // El personaje recibe daño. Si está defendiendo, el daño se reduce a la mitad
    public void recibirDaño(int daño) {
        if (defendiendo) { // Si el personaje está defendiendo, reduce el daño
            daño *= 0.5; // El daño se reduce a la mitad
            System.out.println("\u001B[36m¡Defensa exitosa! Daño reducido a " + daño + "\u001B[0m");
        }
        this.vida_hp -= daño; // Resta el daño a la vida actual del personaje
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño. Vida restante: " + vida_hp); // Muestra el daño recibido y la vida restante
        defendiendo = false; // Después de recibir daño, se desactiva el modo defensivo
    }

    // Permite que el personaje recupere vida si tiene recuperaciones disponibles
    public void recuperar() {
        if (contRecuperar > 0) { // Solo puede recuperar si tiene recuperaciones disponibles
            int recuperarHp = 20; // Cantidad de vida que recupera
            vida_hp += recuperarHp; // Suma la vida recuperada
            if (vida_hp > vidaMaxima) { // Si la vida supera la máxima, se ajusta
                vida_hp = vidaMaxima; // Asegura que no exceda la vida máxima
            }
            contRecuperar--; // Reduce el contador de recuperaciones
            System.out.println("\u001B[32m" + nombre + " ha recuperado " + recuperarHp + " puntos de vida. Vida actual: " + vida_hp + "\u001B[0m"); // Muestra la vida recuperada
        } else {
            System.out.println("\u001B[31m" + nombre + " no puede recuperar más vida.\u001B[0m"); // Si no puede recuperar, se muestra un mensaje
        }
    }

    // El personaje realiza un ataque especial que triplica el daño normal
    public void ataqueEspecial(Personaje enemigo) {
        int dañoEspecial = this.fuerza * 3; // Calcula el daño especial, que es 3 veces la fuerza normal
        enemigo.recibirDaño(dañoEspecial); // El enemigo recibe el daño especial
        System.out.println("\u001B[35m⚔️ " + nombre + " realiza un ataque especial causando " + dañoEspecial + " puntos de daño!\u001B[0m"); // Muestra el daño especial infligido
    }

    // Imprime un separador visual para mejorar la legibilidad
    public static void imprimirSeparador() {
        System.out.println("\u001B[37m----------------------------------------\u001B[0m"); // Línea separadora
    }
}

// Superhéroe que hereda de Personaje, con habilidades especiales
class SuperHero extends Personaje {

    public SuperHero(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp); // Llama al constructor de la clase base
    }

    // El superhéroe usa una habilidad que aumenta temporalmente su fuerza
    public void habilidadHeroica() {
        System.out.println("\u001B[36m✨" + nombre + " utiliza su habilidad heroica para aumentar su fuerza temporalmente!\u001B[0m");
        fuerza += 30; // Aumenta la fuerza en 30 puntos
    }

    @Override
    public void recibirDaño(int daño) {
        super.recibirDaño(daño / 2); // Los superhéroes reciben la mitad del daño
    }
}

// Villano que hereda de Personaje, con habilidad de ataque sorpresa
class Villano extends Personaje {

    public Villano(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp); // Llama al constructor de la clase base
    }

    // El villano realiza un ataque sorpresa que inflige daño adicional aleatorio
    public void habilidadVillana(Personaje enemigo) {
        int ataqueExtra = new Random().nextInt(30); // Genera un daño aleatorio adicional entre 0 y 30
        System.out.println("\u001B[31m🔥" + nombre + " lanza un ataque sorpresa infligiendo " + ataqueExtra + " puntos de daño adicionales!\u001B[0m");
        enemigo.recibirDaño(ataqueExtra); // El enemigo recibe el daño adicional
    }

    @Override
    public void recibirDaño(int daño) {
        super.recibirDaño((int) (daño * 0.8)); // Los villanos reciben un 80% del daño normal
    }
}

// Clase principal donde se ejecuta el combate
public class App {

    public static void main(String[] args) {
        // Crear superhéroes con atributos predefinidos
        try (Scanner scanner = new Scanner(System.in) // Crea un objeto Scanner para leer la entrada del usuario
        ) {
            // Crear superhéroes con atributos predefinidos
            SuperHero[] heroes = {
                new SuperHero("Superman", 150, 120, 400),
                new SuperHero("Batman", 130, 110, 300),
                new SuperHero("Wonder Woman", 140, 130, 350)
            };  // Crear villanos con atributos predefinidos
            Villano[] villanos = {
                new Villano("Joker", 110, 80, 425),
                new Villano("Thanos", 170, 90, 450),
                new Villano("Hela", 150, 85, 400)
            };  // El jugador elige un superhéroe y un villano para el combate
            SuperHero heroe = seleccionarPersonaje(heroes, "Elige a tu Superhéroe", scanner);
            Villano villano = seleccionarPersonaje(villanos, "Elige a tu Villano", scanner);
            iniciarCombate(heroe, villano, scanner); // Inicia el combate entre el héroe y el villano
            // Cierra el Scanner para liberar recursos
        }
    }

    // Permite seleccionar un personaje entre una lista de opciones
    public static <T extends Personaje> T seleccionarPersonaje(T[] personajes, String mensaje, Scanner scanner) {
        System.out.println("\u001B[34m" + mensaje + "\u001B[0m"); // Muestra el mensaje de selección
        for (int i = 0; i < personajes.length; i++) { // Itera sobre la lista de personajes
            System.out.println((i + 1) + ". " + personajes[i].nombre); // Muestra los personajes disponibles
        }
        int eleccion = scanner.nextInt() - 1; // El usuario elige un personaje
        T personaje = personajes[eleccion]; // Obtiene el personaje seleccionado
        System.out.println("Has elegido a " + personaje.nombre + "!"); // Confirma la selección
        personaje.mostrarInfo(); // Muestra la información del personaje seleccionado
        return personaje; // Devuelve el personaje seleccionado
    }

    // Inicia el combate entre el héroe y el villano
    public static void iniciarCombate(SuperHero heroe, Villano villano, Scanner scanner) {
        System.out.println("\u001B[33m⚔️ ¡El combate ha comenzado! ⚔️\u001B[0m"); // Muestra un mensaje de inicio del combate
        Personaje.imprimirSeparador(); // Imprime un separador visual

        boolean turnoHeroe = heroe.velocidad >= villano.velocidad; // Determina quién tiene el primer turno basado en la velocidad
        while (heroe.vida_hp > 0 && villano.vida_hp > 0) { // El combate continúa mientras ambos tengan vida
            if (turnoHeroe) { // Si es el turno del héroe
                realizarAccion("superhéroe", heroe, villano, scanner); // El héroe realiza una acción
            } else { // Si es el turno del villano
                realizarAccion("villano", villano, heroe, scanner); // El villano realiza una acción
            }
            turnoHeroe = !turnoHeroe; // Alterna el turno entre héroe y villano
            Personaje.imprimirSeparador(); // Imprime un separador visual después de cada turno
        }

        // Muestra el ganador del combate
        System.out.println((heroe.vida_hp > 0 ? heroe.nombre : villano.nombre) + " ha ganado el combate! 🎉");
    }

    // Permite al jugador realizar una acción en su turno
    public static void realizarAccion(String tipo, Personaje atacante, Personaje defensor, Scanner scanner) {
        // Muestra las opciones de acción disponibles
        System.out.println("\u001B[36mTurno del " + tipo + ". Elige una acción:\n1. Atacar\n2. Defender\n3. Recuperar\n4. Ataque Especial");
        if (atacante instanceof SuperHero) { // Si es un héroe, muestra la opción de habilidad heroica
            System.out.println("5. Habilidad Heroica");
        } else { // Si es un villano, muestra la opción de habilidad villana
            System.out.println("5. Habilidad Villana");
        }
        int accion = scanner.nextInt(); // Lee la acción seleccionada por el jugador
        switch (accion) { // Ejecuta la acción correspondiente
            case 1 ->
                atacante.atacar(defensor); // Ataca al enemigo
            case 2 ->
                atacante.defender(); // Se defiende
            case 3 ->
                atacante.recuperar(); // Recupera vida
            case 4 ->
                atacante.ataqueEspecial(defensor); // Realiza un ataque especial
            case 5 -> {
                if (atacante instanceof SuperHero hero) {
                    hero.habilidadHeroica(); // Si es un héroe, usa su habilidad heroica
                } else if (atacante instanceof Villano villano) {
                    villano.habilidadVillana(defensor); // Si es un villano, usa su habilidad villana

                }
            }
            default ->
                System.out.println("\u001B[31mAcción no válida. Pierdes tu turno.\u001B[0m"); // Si la acción no es válida, pierde el turno
        }
    }
}
