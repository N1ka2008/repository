import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class KrmeniBailieTest {

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
