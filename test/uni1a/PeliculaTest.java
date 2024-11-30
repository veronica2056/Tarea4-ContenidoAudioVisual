
package uni1a;

import org.junit.Test;
import static org.junit.Assert.*;
public class PeliculaTest {
    // Verifica la correcta conversión de la Película a formato CSV
    @Test
    public void testToCSV() {
        // Crear una instancia de Pelicula
        Pelicula pelicula = new Pelicula("Titanic", 195, "Drama", "Paramount Pictures");
        pelicula.agregarActor(new Actor("Leonardo DiCaprio", 48));
        pelicula.agregarActor(new Actor("Kate Winslet", 47));

        // CSV esperado
        String expectedCSV = "Pelicula,Titanic,195,Drama,Paramount Pictures,Leonardo DiCaprio-48,Kate Winslet-47";
        
        // Verificar que el CSV generado sea el mismo que el esperado
        assertEquals(expectedCSV, pelicula.toCSV());
    }

    // Verifica la correcta conversión de un CSV a una instancia de Película
    @Test
    public void testFromCSV() {
        // Línea CSV de entrada
        String csvLine = "Pelicula,Titanic,195,Drama,Paramount Pictures,Leonardo DiCaprio-48,Kate Winslet-47";
        
        // Convertir la línea CSV a objeto
        Pelicula pelicula = Pelicula.fromCSV(csvLine);

        // Verificar los valores extraídos del CSV
        assertEquals("Titanic", pelicula.getTitulo());
        assertEquals(195, pelicula.getDuracionEnMinutos());
        assertEquals("Drama", pelicula.getGenero());
        assertEquals("Paramount Pictures", pelicula.getEstudio());
        assertEquals(2, pelicula.getActores().size()); // Verificar que se agregaron 2 actores
    }
}


