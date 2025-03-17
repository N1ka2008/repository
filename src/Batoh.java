import java.util.ArrayList;

public class Batoh {

    ArrayList<Predmet> predmety = new ArrayList<>();

    public String pridatDoBatohu(Predmet p){
        predmety.add(p);
        p.setJeVzaty(true);
        return "Predmet pridan do batohu";
    }

    public ArrayList<Predmet> getPredmety() {
        return predmety;
    }

    public void vypsatObsah(){
        for(Predmet p : predmety){
            for(int i = 0; i < predmety.size(); i++) {
                System.out.println(p.getNazevPr());
            }
        }
    }


}
