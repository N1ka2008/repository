package tridy;

import java.util.ArrayList;
import java.util.List;

/**
 * Trida pro mistnosti
 */
public class Mistnost {

    String nazev;
    private AplikacePouzitiPredmetu pouz;

    List<Mistnost> sousedni = new ArrayList<>();

    public Mistnost(String nazev, AplikacePouzitiPredmetu pouz) {
        this.nazev = nazev;
    }

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
