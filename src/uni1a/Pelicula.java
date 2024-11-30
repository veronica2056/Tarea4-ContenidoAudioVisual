/**
 * Class Pelicula
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;
// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
 
    private final String estudio; // Estudio que produce la película
    private final List<Actor> listaActores; // Lista de actores de la película

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero); // Llamada al constructor de la clase base
        this.estudio = estudio;
        this.listaActores = new ArrayList<>(); // Inicializa la lista de actores
    }

    public String getEstudio() {
        return estudio;
    }

    public void agregarActor(Actor actor) {
        if (actor != null) {
            listaActores.add(actor); // Agrega un actor a la lista
        } else {
            System.err.println("El actor no puede ser nulo."); // Manejo de actores nulos
        }
    }

    public List<Actor> getActores() {
        return listaActores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\nDetalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores: ");
        listaActores.forEach(System.out::println); // Muestra todos los actores de la película
    }

    @Override
    public String toCSV() {
        StringBuilder csv = new StringBuilder("Pelicula," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + estudio);
        for (Actor actor : listaActores) {
            csv.append(",").append(actor.getNombre()).append("-").append(actor.getEdad());
        }
        return csv.toString(); // Devuelve el formato CSV de la película
    }

    public static Pelicula fromCSV(String csvLine) {
        String[] datos = csvLine.split(",");
        Pelicula pelicula = new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]);
        for (int i = 5; i < datos.length; i++) {
            String[] actorDatos = datos[i].split("-");
            pelicula.agregarActor(new Actor(actorDatos[0], Integer.parseInt(actorDatos[1])));
        }
        return pelicula; // Crea una película a partir del CSV
    }
}
  
