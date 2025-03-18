public class Postava extends Mistnost{

    private String jmeno;
    private boolean jeVMistnosti = true;
    private boolean jeZaporna;
    private String monolog;

    public Postava(String nazev) {

        super(nazev);
    }

    public Postava(String nazev, String jmeno, boolean jeZaporna, String monolog) {
        super(nazev);
        this.jmeno = jmeno;
        this.jeZaporna = jeZaporna;
        this.monolog = monolog;
    }

    public Postava(String nazev, String jmeno, boolean jeZaporna) {
        super(nazev);
        this.jmeno = jmeno;
        this.jeZaporna = jeZaporna;
    }

    public boolean jeVMistnosti(String nazevMistnosti) {
        if(nazevMistnosti.equalsIgnoreCase(nazev) && jeZaporna == false){
            System.out.println("dede");
            setJeVMistnosti(true);
        }else {
            setJeVMistnosti(false);
        }
        return jeVMistnosti;
    }

    public void souboj(){
        if(jeZaporna == true){

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
}
