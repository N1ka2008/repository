import java.io.IOException;

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


    public boolean jeVMistnosti(String nazevMistnosti) {
        if(nazevMistnosti.equalsIgnoreCase(nazev) && jeVzaty == false){
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
