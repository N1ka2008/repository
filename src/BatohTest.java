import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

/**
 * Trida pro test batohu
 */
public class BatohTest {

    private Batoh b;

    @Before
    public void setUp() throws IOException {
        b = new Batoh();
    }

    /**
     * Test pridani do batohu
     */
    @Test
    public void testPridaniPredmetuDoBatohu() throws IOException {

        Predmet pacidlo = new Predmet("koupelna", "pacidlo");

        assertEquals(0, b.getPredmety().size());

        b.pridatDoBatohu(pacidlo);

        assertEquals(1, b.getPredmety().size());
        assertEquals("pacidlo", b.getPredmety().get(0).getNazevPr());
        assertTrue(pacidlo.isJeVzaty());
    }
}
