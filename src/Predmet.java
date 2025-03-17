import java.io.IOException;
import java.util.ArrayList;

public class Predmet extends Mistnost{

    private String nazevPr;
    private boolean jeVMistnosti;
    private boolean jeVzaty;

    ArrayList<Predmet> premeti = new ArrayList<>();
    public void add(Predmet p) {
       premeti.add(p);
        System.out.println("aaa");
    }

    public Predmet(String nazev) throws IOException {
        super(nazev);
    }

    public Predmet(String nazev, String nazevPr) throws IOException {
        super(nazev);
        this.nazevPr = nazevPr;
    }

    public Predmet() throws IOException {
        super(null);
    }


    //Lokace l = new Lokace(".idea/soub.txt");
    //Pohyb po = new Pohyb(l.getMistnost("hala"));
    Pohyb po = new Pohyb();


   /* public void vypis(){
        System.out.println(po.getAktualniMistnost());
        String mit = String.valueOf(po.getAktualniMistnost());
        for(Predmet p : premeti) {
            if (p.nazev.equalsIgnoreCase(mit) || jeVzaty == false) {
                System.out.println("V teto mistnosti se nachazi " + nazevPr);
            }
        }
    }

    */

    public boolean jeVMistnosti(String nazevMistnosti) {
        if(nazevMistnosti.equals(nazev) && jeVzaty == false){
            jeVMistnosti = true;

        }else {
            jeVMistnosti = false;
        }
        return jeVMistnosti;
    }

    public String getNazevPr() {
        return nazev;
    }

    public void setNazevPr(String nazev) {
        this.nazev = nazev;
    }

    public boolean isJeVMistnosti() {
        return jeVMistnosti;
    }

    public void setJeVMistnosti(boolean jeVMistnosti) {
        this.jeVMistnosti = jeVMistnosti;
    }

    public boolean isJeVzaty() {
        return jeVzaty;
    }

    public void setJeVzaty(boolean jeVzaty) {
        this.jeVzaty = jeVzaty;
    }
}
