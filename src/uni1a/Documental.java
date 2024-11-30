/**
 * Class Documental
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;
// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {

    private final String tema; // Tema principal del documental
    private final List<Investigador> listaInvestigadores; // Lista de investigadores en el documental

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero); // Llamada al constructor de la clase base
        this.tema = tema;
        this.listaInvestigadores = new ArrayList<>(); // Inicializa la lista de investigadores
    }

    public void agregarInvestigador(Investigador investigador) {
        if (investigador != null) {
            listaInvestigadores.add(investigador); // Agrega un investigador a la lista
        } else {
            System.err.println("El investigador no puede ser nulo.");
        }
    }
public List<Investigador> getInvestigadores() {
        return listaInvestigadores; 
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("\nDetalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println("Investigadores: ");
        listaInvestigadores.forEach(System.out::println); // Muestra todos los investigadores del documental
    }

    @Override
    public String toCSV() {
        StringBuilder csv = new StringBuilder("Documental," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + tema);
        listaInvestigadores.forEach(investigador -> csv.append(",").append(investigador.getNombre()).append("-").append(investigador.getCampo()));
        return csv.toString(); // Devuelve el formato CSV del documental
    }

    public static Documental fromCSV(String csvLine) {
        String[] datos = csvLine.split(",");
        Documental documental = new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]);
        for (int i = 5; i < datos.length; i++) {
            String[] investigadorDatos = datos[i].split("-");
            documental.agregarInvestigador(new Investigador(investigadorDatos[0], investigadorDatos[1]));
        }
        return documental; // Crea un documental a partir del CSV
    }
}

