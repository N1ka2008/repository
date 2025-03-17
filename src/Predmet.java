import java.io.IOException;
import java.util.ArrayList;

public class Predmet extends Mistnost{

    private String nazevPr;
    private boolean jeVMistnosti;
    private boolean jeVzaty;



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




    public boolean jeVMistnosti(String nazevMistnosti) {
        if(nazevMistnosti.equals(nazev) && jeVzaty == false){
            System.out.println("Aaaaa");
            jeVMistnosti = true;

        }else {
            jeVMistnosti = false;
        }
        return jeVMistnosti;
    }

    public String getNazevPr() {
        return nazevPr;
    }

    public void setNazevPr(String nazevPr) {
        this.nazevPr = nazevPr;
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
