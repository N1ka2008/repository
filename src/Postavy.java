import java.util.ArrayList;

public class Postavy {

    ArrayList<Postava> postavy = new ArrayList<>();

    public void add(Postava p) {
        postavy.add(p);
        System.out.println("aaaaaaaaaaaaaaaaap");
    }

    private Pohyb po;

    public Postavy(Pohyb po) {
        this.po = po;
    }

    public void vypis(){
        System.out.println(po.getAktualniMistnost());
        //String mit = String.valueOf(po.getAktualniMistnost());
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
