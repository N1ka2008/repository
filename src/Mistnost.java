
import java.util.ArrayList;
import java.util.List;


public class Mistnost {

    String nazev;
    List<Mistnost> sousedni = new ArrayList<>();

    public Mistnost(String nazev) {
        this.nazev = nazev;
    }

    public void pridatSouseda(Mistnost mistnost) {
        sousedni.add(mistnost);
    }

}
