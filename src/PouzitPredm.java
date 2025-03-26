public class PouzitPredm extends Command{

    private Predmety p;
    private Batoh b;
    private AplikacePouzitiPredmetu pac;
    private Postavy post;

    public PouzitPredm(Predmety p, Batoh b, AplikacePouzitiPredmetu pac, Postavy post) {
        this.p = p;
        this.b = b;
        this.pac = pac;
        this.post = post;
    }

    public PouzitPredm(Predmety p) {
        this.p = p;
        //this.b = b;
    }

    public boolean execute(String argument){
        for (Predmet pe : p.premeti) {
            if (pe.getNazevPr().equalsIgnoreCase(argument)) {
                if (b.getPredmety().stream().anyMatch(item -> item.getNazevPr().equalsIgnoreCase(argument))) {
                    System.out.println("Predmet pouzit: " + pe.getNazevPr());
                    if (pac.bedna() == true) {
                        Boolean pacResult = pac.pouzitPac();
                        if (pacResult != false) {
                            System.out.println(pacResult);
                        }
                    }
                    Boolean fotoResult = pac.pouzitFotoaparat();
                    if (fotoResult != false) {
                        System.out.println(fotoResult);
                    }
                    pac.pouzitiKlice1();
                    pac.pouzitiKlice2();
                    Boolean krmResult = pac.pouzitiPsihoKrm();
                    if(krmResult != false){
                        System.out.println(krmResult);
                    }
                } else {
                    System.out.println("Tento predmet nemate");
                }
            }
        }
        return true;
    }

    public boolean exit() {
        return false;
    }
}
