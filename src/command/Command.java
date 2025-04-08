package command;

import org.junit.Before;
import org.junit.Test;
import tridy.*;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Commands
 */
public abstract class Command {

    protected String prikaz;

    public void setPrikaz(String prikaz) {
        this.prikaz = prikaz;
    }

    public boolean exit() {
        return false;
    }

    public abstract boolean execute(String argument);

    /**
     * Trida pro testovani postav
     */
    public static class PostavaTest {

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

    /**
     * Trida pro testovani pouziti predmetu
     */
    public static class PouzitiPredmetuTest {

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
}
