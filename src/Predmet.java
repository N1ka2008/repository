public class Predmet extends Mistnost{

    private String nazevPr;
    private boolean jeVMistnosti;
    private boolean jeVzaty;

    public Predmet(String nazev) {
        super(nazev);
    }

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
