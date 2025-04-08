import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class PohybTest {

    private Lokace l;
    private Pohyb po;

    @Before
    public void setUp() throws IOException {
        l = new Lokace(".idea/soub.txt");
        po = new Pohyb(l.getMistnost("hala"));
    }

    @Test
    public void testPohybMeziMistnostmi() {

        String pocatecniMistnost = po.getAktualniMistnost();
        assertEquals("hala", pocatecniMistnost);

    }

}
