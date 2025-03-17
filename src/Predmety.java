import java.util.ArrayList;

public class Predmety {

    ArrayList<Predmet> premeti = new ArrayList<>();
    public void add(Predmet p) {
        premeti.add(p);
        System.out.println("aaa");
    }

    private Pohyb po;

    public Predmety(Pohyb po) {
        this.po = po;
    }

    public void vypis(){
        System.out.println(po.getAktualniMistnost());
        //String mit = String.valueOf(po.getAktualniMistnost());
        for(Predmet p : premeti) {
            if (p.nazev.equalsIgnoreCase(po.getAktualniMistnost()) && (!p.isJeVzaty())) {
                System.out.println("V teto mistnosti se nachazi " + p.getNazevPr());
            }
        }
    }
}
