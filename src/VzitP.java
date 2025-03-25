import java.io.IOException;

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
        for(Predmet pe : p.premeti) {
            if (pe.isJeVMistnosti() && pe.getNazevPr().equalsIgnoreCase(argument)) {
                b.pridatDoBatohu(pe);
                System.out.println("Vzali jste predmet");
            } else if(!(pe.isJeVMistnosti()) && !(pe.getNazevPr().equalsIgnoreCase(argument))){
                System.out.println("Predmet neexistuje");
            }
        }
            return true;
    }


    public boolean exit () {
            return false;
    }

}
