package poo;
import Controlator.ControladorContenido;
import Vista.VistaConsola;
import java.util.ArrayList;
import java.util.List;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        // Crear la lista de contenidos audiovisuales
        List<ContenidoAudiovisual> contenidos = inicializarDatos();

        // Crear la vista y el controlador
        VistaConsola vista = new VistaConsola();
        ControladorContenido controlador = new ControladorContenido(contenidos, vista);

        // Iniciar el sistema
        controlador.iniciar();
    }

    /**
     * Inicializa una lista de contenidos audiovisuales con ejemplos.
     *
     * @return Lista de contenidos audiovisuales.
     */
    private static List<ContenidoAudiovisual> inicializarDatos() {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();

        // Crear y agregar películas
        Pelicula avatar = new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios");
        avatar.agregarActor(new Actor("Sam Worthington", 46));
        avatar.agregarActor(new Actor("Zoe Saldaña", 45));
        contenidos.add(avatar);

        // Crear y agregar series de TV
        SerieDeTV got = new SerieDeTV("Game of Thrones", 60, "Fantasía");
        got.agregarTemporada(new Temporada(1, 10));
        got.agregarTemporada(new Temporada(2, 10));
        contenidos.add(got);

        // Crear y agregar documentales
        Documental cosmos = new Documental("Cosmos", 45, "Ciencia", "Astronomía");
        cosmos.agregarInvestigador(new Investigador("Carl Sagan", "Astrofísica"));
        cosmos.agregarInvestigador(new Investigador("Neil deGrasse Tyson", "Cosmología"));
        contenidos.add(cosmos);

        return contenidos;
    }
}



