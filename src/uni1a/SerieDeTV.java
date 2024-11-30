/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;
// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private final List<Temporada> listaTemporadas; // Lista de temporadas de la serie

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero); // Llamada al constructor de la clase base
        this.listaTemporadas = new ArrayList<>(); // Inicializa la lista de temporadas
    }

    public void agregarTemporada(Temporada temporada) {
        if (temporada != null) {
            listaTemporadas.add(temporada); // Agrega una temporada a la serie
        } else {
            System.err.println("La temporada no puede ser nula.");
        }
    }

    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\nDetalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos por episodio");
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: ");
        listaTemporadas.forEach(System.out::println); // Muestra todas las temporadas de la serie
    }

    @Override
    public String toCSV() {
        StringBuilder csv = new StringBuilder("SerieDeTV," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero());
        for (Temporada temporada : listaTemporadas) {
            csv.append(",").append(temporada.getNumero()).append("-").append(temporada.getEpisodios());
        }
        return csv.toString(); // Devuelve el formato CSV de la serie
    }

    public static SerieDeTV fromCSV(String csvLine) {
        String[] datos = csvLine.split(",");
        SerieDeTV serie = new SerieDeTV(datos[1], Integer.parseInt(datos[2]), datos[3]);
        for (int i = 4; i < datos.length; i++) {
            String[] temporadaDatos = datos[i].split("-");
            serie.agregarTemporada(new Temporada(Integer.parseInt(temporadaDatos[0]), Integer.parseInt(temporadaDatos[1])));
        }
        return serie; // Crea una serie a partir del CSV
    }
}

