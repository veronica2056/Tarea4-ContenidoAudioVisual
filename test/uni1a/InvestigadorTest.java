
package uni1a;

import org.junit.Test;
import static org.junit.Assert.*;
public class InvestigadorTest {
    // Verifica que el nombre del investigador sea correcto
    @Test
    public void testGetNombre() {
        Investigador investigador = new Investigador("Carl Sagan", "Astrofísica");

        // Verificar que el nombre se obtenga correctamente
        assertEquals("Carl Sagan", investigador.getNombre());
    }

    // Verifica que el campo del investigador sea correcto
    @Test
    public void testGetCampo() {
        Investigador investigador = new Investigador("Carl Sagan", "Astrofísica");

        // Verificar que el campo se obtenga correctamente
        assertEquals("Astrofísica", investigador.getCampo());
    }
}
