/**
 * Command Pouzit
 */
public class PouzitPredm extends Command {

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
    }

    public boolean execute(String argument) {

        for (Predmet pe : p.premeti) {
            if (pe.getNazevPr().equalsIgnoreCase(argument)) {
                if (b.getPredmety().stream().anyMatch(item -> item.getNazevPr().equalsIgnoreCase(argument))) {
                    System.out.println("Predmet pouzit: " + pe.getNazevPr());
                    switch (argument.toLowerCase()) {
                        case "pacidlo":
                            if (pac.bedna() == true) {
                                System.out.println(pac.pouzitPac());
                            }
                            break;
                        case "fotoaparat":
                            System.out.println(pac.pouzitFotoaparat());
                            break;
                        case "1. klic":
                            pac.pouzitiKlice1();
                        break;

                        case "2. klic":
                            pac.pouzitiKlice2();
                        break;
                        case "psi krmeni":
                            System.out.println(pac.pouzitiPsihoKrm());
                            break;
                    }
                } else {
                    System.out.println("Tento predmet nemate");
                }

            }
        }
            return true;

    }
            public boolean exit () {
                return false;
            }
}
