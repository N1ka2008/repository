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

       /* for(Predmet pe : p.premeti) {
            if (b.predmety.contains(pe) && pe.getNazevPr().equalsIgnoreCase(argument)) {
                System.out.println("Predmet pouzit");
                //b.predmety.remove(p);
                if (pac.bedna() == true) {
                    pac.pouzitPac();
                }
                //pac.pouzitFotoaparat();
                //pac.pouzitiKlice1();
                //pac.pouzitiKlice2();
                //pac.pouzitiPsihoKrm();
            } else if (!(b.predmety.contains(pe)) && !(pe.getNazevPr().equalsIgnoreCase(argument))) {
                System.out.println("tento predmet nemate");
            }
        }

        */

        for (Predmet pe : p.premeti) {
            if (pe.getNazevPr().equalsIgnoreCase(argument)) {
                if (b.getPredmety().stream().anyMatch(item -> item.getNazevPr().equalsIgnoreCase(argument))) {
                    System.out.println("Predmet pouzit: " + pe.getNazevPr());
                    if (pac.bedna() == true) {
                        System.out.println(pac.pouzitPac());
                    }
                    System.out.println(pac.pouzitFotoaparat());
                    pac.pouzitiKlice1();
                    pac.pouzitiKlice2();
                    System.out.println(pac.pouzitiPsihoKrm());
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
