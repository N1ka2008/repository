package tridy;

import java.util.ArrayList;

/**
 * Trida pro arraylist postav
 */
public class Postavy {

    private boolean konecHry;

    public ArrayList<Postava> postavy = new ArrayList<>();

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
                    System.out.println("Vidis divku schovanou pod stolem, nad kterym James.....");
                    System.out.println(p.getMonolog());
                }
            }
        }
    }
    public boolean isKonecHry() {
        return konecHry;
    }

    public void setKonecHry(boolean konecHry) {
        this.konecHry = konecHry;
    }
}
