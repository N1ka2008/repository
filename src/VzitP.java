import java.io.IOException;

public class VzitP extends Command {

    Predmet p = new Predmet();


    Batoh b = new Batoh();

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
