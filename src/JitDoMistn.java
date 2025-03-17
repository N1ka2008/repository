import java.io.IOException;
import java.util.Scanner;

public class JitDoMistn extends Command {

    Scanner sc = new Scanner(System.in);

    /*public void execute(Pohyb po){
        System.out.println("Jsi v místnosti: " + po.getAktualniMistnost());
        System.out.print("Kam chceš jít? ");
        String cil = sc.nextLine();
        po.jit(cil);
    }

     */



    //Lokace l = new Lokace(".idea/soub.txt");

    //Pohyb po = new Pohyb(l.getMistnost("hala"));

    private Pohyb po;

    public JitDoMistn(Pohyb po) {
        this.po = po;
    }


    public JitDoMistn() throws IOException {
    }


    @Override
    public boolean execute(String argument) {
        if (argument.isEmpty()) {
            System.out.println("Musíš zadat místnost, kam chceš jít!");
        }
        po.jit(argument);
        System.out.println("Přesunul ses do místnosti: " + po.getAktualniMistnost());

        return true;
    }

    public boolean exit() {
        return false;
    }


}
