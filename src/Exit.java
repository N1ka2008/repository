import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Exit command
 */
public class Exit extends Command{

    public boolean execute(String arguent){
        return false;
    }

    public boolean exit() {
        return true;
    }

    /**
     * Trida pro test batohu
     */
    public static class BatohTest {

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

            Assert.assertEquals(0, b.getPredmety().size());

            b.pridatDoBatohu(pacidlo);

            Assert.assertEquals(1, b.getPredmety().size());
            Assert.assertEquals("pacidlo", b.getPredmety().get(0).getNazevPr());
            assertTrue(pacidlo.isJeVzaty());
        }
    }

    /**
     * Trida pro test krmeni Bailie
     */
    public static class KrmeniBailieTest {

        private Lokace l;
        private Pohyb po;
        private Postavy post;
        private Batoh b;

        @Before
        public void setUp() throws IOException {
            l = new Lokace(".idea/soub.txt");
            po = new Pohyb(l.getMistnost("hala"));
            post = new Postavy(po);
            b = new Batoh();
        }

        /**
         * Test krmeni Bailie
         */
        @Test
        public void testNakrmitBailie() throws IOException {

            Predmet psiKrmeni = new Predmet("kuchyn", "psi krmeni");
            b.pridatDoBatohu(psiKrmeni);
            b.vypsatObsah();

            Postava bailie = new Postava("1. tajna mistnost", "Bailie", false, false);
            post.add(bailie);

            assertFalse(bailie.isJeOchocena());


            NakrmitBailie nakrm = new NakrmitBailie(post, b);
            nakrm.execute("");
            assertTrue(bailie.isJeOchocena());
        }
    }

    /**
     * Trida pro testovani pohybu
     */
    public static class PohybTest {

        private Lokace l;
        private Pohyb po;

        @Before
        public void setUp() throws IOException {
            l = new Lokace(".idea/soub.txt");
            po = new Pohyb(l.getMistnost("hala"));
        }

        /**
         * Test pohybu mezi mistnostmi
         */
        @Test
        public void testPohybMeziMistnostmi() {

            String pocatecniMistnost = po.getAktualniMistnost();
            assertEquals("hala", pocatecniMistnost);

            po.jit("koupelna");
            assertEquals("koupelna", po.getAktualniMistnost());

            //String predPresun = pohyb.getAktualniMistnost();
           // pohyb.jit("sklep");
           // assertEquals(predPresun, pohyb.getAktualniMistnost());
        }
    }
}
