
import java.util.ArrayList;
import java.util.List;


public class Mistnost {

    String nazev;
    /**
     * arraylist pro mistnosti
     */
    List<Mistnost> sousedni = new ArrayList<>();

    public Mistnost(String nazev) {
        this.nazev = nazev;
    }

    public void pridatSousedni(Mistnost mistnost) {
        sousedni.add(mistnost);
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public Mistnost() {

    }
}
