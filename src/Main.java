import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Lokace lokace = new Lokace(".idea/soub.txt");
            Pohyb po = new Pohyb(lokace.getMistnost("hala"));

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Jsi v místnosti: " + po.getAktualniMistnost());
                System.out.print("Kam chceš jít? ");
                String cil = sc.nextLine();
                po.jit(cil);
            }
        } catch (IOException e) {
            System.out.println("Chyba při načítání souboru: ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}