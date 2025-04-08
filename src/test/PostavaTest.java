package test;

import org.junit.Before;
import org.junit.Test;
import tridy.*;

import static org.junit.Assert.*;
import java.io.IOException;

/**
 * Trida pro test postav
 */
public class PostavaTest {

    private Lokace l;
    private Pohyb po;
    private Postavy post;
    private Batoh b;

    @Before
    public void setUp() throws IOException {
        l = new Lokace(".idea/soub.txt");
        po = new Pohyb(l.getMistnost("hala"));
        post = new Postavy(po);
    }

    /**
     * Test jestli je postava v mistnosti
     */
    @Test
    public void testPostavaVMistnosti() throws IOException {

        Postava duch = new Postava("detsky pokoj", "duch", false, "vetaaaaa.....", b);
        post.add(duch);
        po.setAktualniMistnost(l.getMistnost("detsky pokoj"));
        assertTrue(duch.jeVMistnosti(po.getAktualniMistnost()));
        post.vypis();

        po.setAktualniMistnost(l.getMistnost("hala"));
        assertFalse(duch.jeVMistnosti(po.getAktualniMistnost()));
        post.vypis();
    }
}
