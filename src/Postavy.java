import java.util.ArrayList;

/**
 * Trida pro arraylist postav
 */
public class Postavy {

    ArrayList<Postava> postavy = new ArrayList<>();

    /**
     * Pridani postav do arraylistu
     */
    public void add(Postava p) {
        postavy.add(p);
    }

    private Pohyb po;

    public Postavy(Pohyb po) {
        this.po = po;
    }

    /**
     * Vypis postav
     */
    public void vypis(){
        for(Postava p : postavy) {
            if (p.nazev.equalsIgnoreCase(po.getAktualniMistnost())) {
                System.out.println("V teto mistnosti se nachazi " + p.getJmeno());
                if(p.isJeZaporna()){
                    System.out.println("Pozor! muze byt nebezpecny");
                }
            }
        }
    }
}
