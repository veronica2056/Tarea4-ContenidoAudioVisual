
package Controlator;

import Utilidades.EscrituraArchivo;
import Utilidades.LecturaArchivo;
import Vista.VistaConsola;
import java.util.List;
import uni1a.ContenidoAudiovisual;

public class ControladorContenido {
    private final List<ContenidoAudiovisual> contenidos;
    private final VistaConsola vista;
    private final String rutaArchivo = "contenidos.csv";
 // Constructor para inicializar la lista de contenidos y la vista
    public ControladorContenido(List<ContenidoAudiovisual> contenidos, VistaConsola vista) {
        this.contenidos = contenidos;
        this.vista = vista;
    }
// Método principal para gestionar el flujo de interacción con el usuario
    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    mostrarContenidos();
                    break;
                case 2:
                    cargarContenidos();
                    break;
                case 3:
                    guardarContenidos();
                    break;
                case 4:
                    continuar = false;// Termina el ciclo y finaliza el programa
                    vista.mostrarMensaje("Hasta luego!");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Intenta nuevamente.");
            }
        }
    }
      // Muestra todos los contenidos cargados
    private void mostrarContenidos() {
        if (contenidos.isEmpty()) {
            vista.mostrarMensaje("No hay contenidos disponibles.");
        } else {
            vista.mostrarMensaje("\nContenidos disponibles:");
            contenidos.forEach(ContenidoAudiovisual::mostrarDetalles);
        }
    }

    // Carga los contenidos desde un archivo CSV
    private void cargarContenidos() {
        List<ContenidoAudiovisual> contenidosCargados = LecturaArchivo.leerArchivoCSV(rutaArchivo);
        contenidos.addAll(contenidosCargados);
        vista.mostrarMensaje("Contenidos cargados exitosamente desde el archivo.");
    }

    // Guarda los contenidos actuales en un archivo CSV
    private void guardarContenidos() {
        EscrituraArchivo.escribirArchivoCSV(rutaArchivo, contenidos);
        vista.mostrarMensaje("Contenidos guardados exitosamente en el archivo.");
    }
}

