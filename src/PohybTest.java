import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class PohybTest {

    private Lokace lokace;
    private Pohyb pohyb;

    @Before
    public void setUp() throws IOException {
        lokace = new Lokace(".idea/soub.txt");
        pohyb = new Pohyb(lokace.getMistnost("hala"));
    }

    @Test
    public void testPohybMeziMistnostmi() {

        String pocatecniMistnost = pohyb.getAktualniMistnost();
        assertEquals("hala", pocatecniMistnost);

        pohyb.jit("koupelna");
        assertEquals("koupelna", pohyb.getAktualniMistnost());

        String predPresun = pohyb.getAktualniMistnost();
        pohyb.jit("sklep");
        assertEquals(predPresun, pohyb.getAktualniMistnost());
    }
}
