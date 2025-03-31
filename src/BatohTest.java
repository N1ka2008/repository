import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class BatohTest {

    private Batoh batoh;

    @Before
    public void setUp() throws IOException {
        batoh = new Batoh();
    }

    @Test
    public void testPridaniPredmetuDoBatohu() throws IOException {

        Predmet pacidlo = new Predmet("koupelna", "pacidlo");

        assertEquals(0, batoh.getPredmety().size());

        batoh.pridatDoBatohu(pacidlo);

        assertEquals(1, batoh.getPredmety().size());
        assertEquals("pacidlo", batoh.getPredmety().get(0).getNazevPr());
        assertTrue(pacidlo.isJeVzaty());
    }
}
