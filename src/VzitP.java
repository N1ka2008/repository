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
            if (p.isJeVMistnosti()) {
                b.pridatDoBatohu(p);
                System.out.println("Vazali jste predmet");
            }
            return true;
    }

    public boolean exit () {
            return false;
    }

}
