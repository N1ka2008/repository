/**
 * Trida pro postavu
 */

public class Postava extends Mistnost{

    private String jmeno;
    private boolean jeVMistnosti = true;
    private boolean jeZaporna;
    private boolean jeOchocena;
    private String monolog;
    private Batoh b;

    public Postava(String nazev) {

        super(nazev);
    }

    public Postava(String nazev, String jmeno, boolean jeZaporna, String monolog, Batoh b) {
        super(nazev);
        this.jmeno = jmeno;
        this.jeZaporna = jeZaporna;
        this.monolog = monolog;
        this.b = b;
    }

    public Postava(String nazev, String jmeno, boolean jeZaporna) {
        super(nazev);
        this.jmeno = jmeno;
        this.jeZaporna = jeZaporna;
    }

    public Postava(String nazev, String jmeno, boolean jeZaporna, boolean jeOchocena) {
        super(nazev);
        this.jmeno = jmeno;
        this.jeZaporna = jeZaporna;
        this.jeOchocena = jeOchocena;
    }

    /**
     * Zjisteni jestli je postava v mistnosti
     */
    public boolean jeVMistnosti(String nazevMistnosti) {
        if(nazevMistnosti.equalsIgnoreCase(nazev) && !isJeZaporna()){
            setJeVMistnosti(true);
        }else {
            setJeVMistnosti(false);
        }
        return jeVMistnosti;
    }

    /**
     * Metoda pro souboj
     */
    public void souboj(){
        for(Predmet p : b.getPredmety()) {
            if (isJeZaporna() && p.getNazevPr().equalsIgnoreCase("nuz") && isJeVMistnosti()) {
                System.out.println();
            }
        }
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public boolean isJeVMistnosti() {
        return jeVMistnosti;
    }

    public void setJeVMistnosti(boolean jeVMistnosti) {
        this.jeVMistnosti = jeVMistnosti;
    }

    public boolean isJeZaporna() {
        return jeZaporna;
    }

    public void setJeZaporna(boolean jeZaporna) {
        this.jeZaporna = jeZaporna;
    }

    public String getMonolog() {
        return monolog;
    }

    public void setMonolog(String monolog) {
        this.monolog = monolog;
    }

    public boolean isJeOchocena() {
        return jeOchocena;
    }

    public void setJeOchocena(boolean jeOchocena) {
        this.jeOchocena = jeOchocena;
    }
}
