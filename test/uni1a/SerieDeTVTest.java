
package uni1a;

import org.junit.Test;
import static org.junit.Assert.*;
import uni1a.SerieDeTV;
import uni1a.Temporada;
public class SerieDeTVTest {
    // Verifica que se pueda agregar temporadas correctamente a la serie
    @Test
    public void testAgregarTemporada() {
        // Crear una serie y agregar temporadas
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 50, "Drama");
        serie.agregarTemporada(new Temporada(1, 7));
        serie.agregarTemporada(new Temporada(2, 13));

        // Verificar el número de temporadas
        assertEquals(2, serie.getListaTemporadas().size());
        assertEquals(7, serie.getListaTemporadas().get(0).getEpisodios()); // Verificar episodios de la temporada 1
    }

    // Verifica que la serie se convierta correctamente a formato CSV
    @Test
    public void testToCSV() {
        // Crear una serie y agregar temporadas
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 50, "Drama");
        serie.agregarTemporada(new Temporada(1, 7));
        serie.agregarTemporada(new Temporada(2, 13));

        // CSV esperado
        String expectedCSV = "SerieDeTV,Breaking Bad,50,Drama,1-7,2-13";
        
        // Verificar que el CSV generado sea el mismo que el esperado
        assertEquals(expectedCSV, serie.toCSV());
    }
}


