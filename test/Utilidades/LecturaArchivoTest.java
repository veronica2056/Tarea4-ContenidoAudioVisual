package Utilidades;

import org.junit.Test;
import static org.junit.Assert.*;
import Utilidades.LecturaArchivo;
import uni1a.ContenidoAudiovisual;
import java.util.List;

public class LecturaArchivoTest {

    @Test
    public void testLeerArchivoCSV() {
        // Leer contenidos desde un archivo CSV
        String rutaArchivo = "test_contenidos.csv";
        List<ContenidoAudiovisual> contenidos = LecturaArchivo.leerArchivoCSV(rutaArchivo);

        // Verificar que el archivo ha sido leído correctamente
        assertEquals(1, contenidos.size());
        assertEquals("Avatar", contenidos.get(0).getTitulo());
    }
}

