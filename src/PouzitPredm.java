public class PouzitPredm extends Command{

    private Predmety p;
    private Batoh b;
    private AplikacePouzitiPredmetu pac;

    public PouzitPredm(Predmety p, Batoh b, AplikacePouzitiPredmetu pac) {
        this.p = p;
        this.b = b;
        this.pac = pac;
    }

    public PouzitPredm(Predmety p) {
        this.p = p;
        //this.b = b;
    }

    public boolean execute(String argument){
        for(Predmet pe : p.premeti) {
            if (b.predmety.contains(pe) && pe.getNazevPr().equalsIgnoreCase(argument)) {
                System.out.println("Predmet pouzit");
                //b.predmety.remove(p);
                if (pac.bedna() == true) {
                    pac.pouzitPac();
                }
                pac.pouzitFotoaparat();
                pac.pouzitiKlice1();
                pac.pouzitiKlice2();
                pac.pouzitiPsihoKrm();
            } else if (!(b.predmety.contains(pe)) && !(pe.getNazevPr().equalsIgnoreCase(argument))) {
                System.out.println("tento predmet nemate");
            }
        }
        return true;
    }

    public boolean exit() {
        return false;
    }
}
