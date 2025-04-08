package tridy;

import java.util.ArrayList;

/**
 * Trida pro batoh
 */
public class Batoh {

    ArrayList<Predmet> predmety = new ArrayList<>();

    /**
     * Pridani do batohu
     */
    public String pridatDoBatohu(Predmet p){
            predmety.add(p);
            p.setJeVzaty(true);
            return "tridy.Predmet pridan do batohu";
    }

    public ArrayList<Predmet> getPredmety() {
        return predmety;
    }

    /**
     * Vypsani obsahu
     */
    public void vypsatObsah(){
        for(Predmet p : predmety){
            //for(int i = 0; i < predmety.size(); i++) {
                System.out.println(p.getNazevPr());
            //}
        }
    }
}
