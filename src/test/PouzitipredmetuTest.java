package test;

import org.junit.Before;
import org.junit.Test;
import tridy.*;

import static org.junit.Assert.*;
import java.io.IOException;

/**
 * Trida pro test pouziti predmetu
 */
public class PouzitipredmetuTest {

    private Lokace l;
    private Pohyb po;
    private Predmety pr;
    private Batoh b;
    private Postavy post;
    private AplikacePouzitiPredmetu pouz;

    @Before
    public void setUp() throws IOException {
        l = new Lokace(".idea/soub.txt");
        po = new Pohyb(l.getMistnost("hala"));
        pr = new Predmety(po);
        b = new Batoh();
        post = new Postavy(po);
        pouz = new AplikacePouzitiPredmetu("jidelna", po, pr, b, post, l);
    }

    /**
     * Test jestli je bedna v mistnosti
     */
    @Test
    public void testBedna() {
        po.setAktualniMistnost(l.getMistnost("jidelna"));

        assertTrue(pouz.bedna());
    }

    /**
     * Test pouziti pacidla
     */
    @Test
    public void testPouzitPac() {
        assertFalse(pouz.isJeBednaOtevrena());

        String vysledek = pouz.pouzitPac();
        assertTrue(pouz.isJeBednaOtevrena());
        assertEquals("V bedne jsi nasel fotku rodiny", vysledek);
    }
}
