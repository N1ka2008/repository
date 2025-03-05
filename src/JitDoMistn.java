import java.util.Scanner;

public class JitDoMistn extends Command{

    Scanner sc = new Scanner(System.in);

    public void execute(Pohyb po){
        System.out.println("Jsi v místnosti: " + po.getAktualniMistnost());
        System.out.print("Kam chceš jít? ");
        String cil = sc.nextLine();
        po.jit(cil);
    }

    public boolean exit() {
        return false;
    }
}
