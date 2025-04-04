/**
 * Trida pro pohyb
 */
public class Pohyb {

    private Mistnost aktualniMistnost;

    public Pohyb(Mistnost startovniMistnost) {
        this.aktualniMistnost = startovniMistnost;
    }
    public Pohyb() {

    }

    /**
     * Zajisti presun do hracem urcene mistnosti. Pokud mistnost neexistuje nebo nesousedi s aktualni
     * hrac zustane v aktualni mistnosti
     */
    public void jit(String nazev){
        for(Mistnost soused : aktualniMistnost.sousedni){
            if(soused.nazev.equals(nazev)){
                aktualniMistnost = soused;
                System.out.println("Aktualni mystnost: " + nazev);
                return;
            }else {
                System.out.println("Do teto mistnosti nemuzes");
            }
        }
    }

    public String getAktualniMistnost() {
        return aktualniMistnost.nazev;
    }

    public void setAktualniMistnost(Mistnost aktualniMistnost) {
        this.aktualniMistnost = aktualniMistnost;
    }
}
