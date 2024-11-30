
package uni1a;

import org.junit.Test;
import static org.junit.Assert.*;
public class DocumentalTest {
    // Verifica que se pueda agregar un investigador correctamente al documental
    @Test
    public void testAgregarInvestigador() {
        Documental documental = new Documental("Cosmos", 60, "Ciencia", "Astronomía");
        documental.agregarInvestigador(new Investigador("Carl Sagan", "Astrofísica"));

        // Verificar que el investigador se haya agregado correctamente
        assertEquals(1, documental.getInvestigadores().size());
        assertEquals("Carl Sagan", documental.getInvestigadores().get(0).getNombre());
    }

    // Verifica que el documental se convierta correctamente a formato CSV
    @Test
    public void testToCSV() {
        Documental documental = new Documental("Cosmos", 60, "Ciencia", "Astronomía");
        documental.agregarInvestigador(new Investigador("Carl Sagan", "Astrofísica"));

        // CSV esperado
        String expectedCSV = "Documental,Cosmos,60,Ciencia,Astronomía,Carl Sagan-Astrofísica";
        
        // Verificar que el CSV generado sea el mismo que el esperado
        assertEquals(expectedCSV, documental.toCSV());
    }
}
