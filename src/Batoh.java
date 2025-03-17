import java.util.ArrayList;

public class Batoh {

    ArrayList<Predmet> predmety = new ArrayList<>();

    public String pridatDoBatohu(Predmet p){
        predmety.add(p);
        p.setJeVzaty(true);
        return "Predmey pridan do batohu";
    }

    public void vypsatObsah(){
        for(Predmet p : predmety){
            System.out.println(p.getNazevPr());
        }
    }
}
