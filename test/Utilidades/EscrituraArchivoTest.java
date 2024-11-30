package Utilidades;

import org.junit.Test;
import uni1a.Pelicula;
import java.util.ArrayList;
import java.util.List;
import uni1a.ContenidoAudiovisual;

public class EscrituraArchivoTest {

    @Test
    public void testEscribirArchivoCSV() {
        // Crear una lista de contenidos
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        contenidos.add(new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios"));

        // Escribir los contenidos en un archivo CSV
        String rutaArchivo = "test_contenidos.csv";
        EscrituraArchivo.escribirArchivoCSV(rutaArchivo, contenidos);
        
        // Verificar que el archivo ha sido guardado correctamente
        // En un escenario real, podrías leer el archivo y validar su contenido
    }
}

