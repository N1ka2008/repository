import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class PostavaTest {

    private Lokace l;
    private Pohyb po;
    private Postavy post;

    @Before
    public void setUp() throws IOException {
        l = new Lokace(".idea/soub.txt");
        po = new Pohyb(l.getMistnost("hala"));
        post = new Postavy(po);
    }

    @Test
    public void testPostavaVMistnosti() throws IOException {

        Postava duch = new Postava("detsky pokoj", "duch", false, "vetaaaaa.....");
        post.add(duch);
        po.setAktualniMistnost(l.getMistnost("detsky pokoj"));
        assertTrue(duch.jeVMistnosti(po.getAktualniMistnost()));
        post.vypis();

        po.setAktualniMistnost(l.getMistnost("hala"));
        assertFalse(duch.jeVMistnosti(po.getAktualniMistnost()));
        post.vypis();
    }
}
