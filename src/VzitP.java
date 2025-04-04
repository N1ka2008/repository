import java.io.IOException;

/**
 * Command Vzit
 */
public class VzitP extends Command {

    private Predmety p;
    private Pohyb po;
    private Batoh b;

    public VzitP(Predmety p, Pohyb po, Batoh b) {
        this.p = p;
        this.po = po;
        this.b = b;
    }

    public VzitP() throws IOException {
    }

    public boolean execute(String argument) {
        boolean predmetNalezen = false;
        for (Predmet pe : p.premeti) {
            if (pe.getNazevPr().equalsIgnoreCase(argument)) {
                if (pe.isJeVMistnosti()) {
                    b.pridatDoBatohu(pe);
                    System.out.println("Vzali jste predmet: " + pe.getNazevPr());
                    predmetNalezen = true;
                    break;
                } else {
                    System.out.println("Predmet " + pe.getNazevPr() + " neni v mistnosti");
                    predmetNalezen = true;
                }
            }
        }
        if (!predmetNalezen) {
            System.out.println("Takovy predmet neexistuje");
        }

        return true;

    }
        public boolean exit () {
            return false;
        }
}
