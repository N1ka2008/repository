import java.util.ArrayList;

/**
 * Trida pro arraylist predmetu
 */
public class Predmety {

    ArrayList<Predmet> premeti = new ArrayList<>();

    /**
     * Pridani predmetu do arraylistu
     */
    public void add(Predmet p) {
        premeti.add(p);
    }

    private Pohyb po;

    public Predmety(Pohyb po) {
        this.po = po;
    }

    /**
     * Vypis postav
     */
    public void vypis(){
        for(Predmet p : premeti) {
            if (p.nazev.equalsIgnoreCase(po.getAktualniMistnost()) && (!p.isJeVzaty())) {
                System.out.println("V teto mistnosti se nachazi " + p.getNazevPr());
            }
        }
    }
}
