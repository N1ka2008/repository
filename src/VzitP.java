import java.io.IOException;

public class VzitP extends Command {

    private Predmet p;
    private Pohyb po;
    private Batoh b;

    public VzitP(Predmet p, Pohyb po, Batoh b) {
        this.p = p;
        this.po = po;
        this.b = b;
    }

    public VzitP() throws IOException {
    }



    public boolean execute(String argument) {
            if (p.isJeVMistnosti() && p.getNazevPr().equalsIgnoreCase(argument)) {
                b.pridatDoBatohu(p);
                System.out.println("Vzali jste predmet");
            } else {
                System.out.println("Predmet neexistuje");
            }
            return true;
    }


    public boolean exit () {
            return false;
    }

}
