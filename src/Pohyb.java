public class Pohyb {

    private Mistnost aktualniMistnost;

    public Pohyb(Mistnost startovniMistnost) {
        this.aktualniMistnost = startovniMistnost;
    }

    public void jit(String nazev){
        for(Mistnost soused : aktualniMistnost.sousedni){
            if(soused.nazev.equals(nazev)){
                aktualniMistnost = soused;
                System.out.println("Aktualni mystnost: " + nazev);
                return;
            }
        }
        System.out.println("Do teto mistnosti nemuzes");
    }

    public String getAktualniMistnost() {
        return aktualniMistnost.nazev;
    }
}
