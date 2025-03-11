import java.util.ArrayList;

public class Batoh extends Konzole{

    ArrayList<Predmet> predmety = new ArrayList<>();

    public String pridatDoBatohu(Predmet p){
        predmety.add(p);
        return "Predmey pridan do batohu";
    }

    public void vypsatObsah(){
        for(Predmet p : predmety){
            System.out.println(p.getNazevPr());
        }
    }
}
