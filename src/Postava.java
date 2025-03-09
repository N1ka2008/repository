public class Postava extends Mistnost{

    private String jmeno;
    private boolean jeVMistnosti;
    private boolean jeZaporna;

    public Postava(String nazev) {
        super(nazev);
    }

    public boolean jeVMistnosti(String nazevMistnosti) {
        if(nazevMistnosti.equals(nazev)){
            jeVMistnosti = true;
        }else {
            jeVMistnosti = false;
        }
        return jeVMistnosti;
    }

    public void souboj(){

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
}
