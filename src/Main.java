import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Lokace lokace = new Lokace(".idea/soub.txt");
        Pohyb po = new Pohyb(lokace.getMistnost("hala"));
        try {
            System.out.println("Mistnosti v 1. patre: hala, koupelna, kuchyn, jidelna, schodiste");
            System.out.println("Mistnosti ve 2. patre: chodba, detsky pokoj, 2. detsky pokoj, loznice, schodiste");
            System.out.println("Mistnosti ve sklepe: sklep, schodiste");
            //Lokace lokace = new Lokace(".idea/soub.txt");
            //Pohyb po = new Pohyb(lokace.getMistnost("hala"));

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Jsi v místnosti: " + po.getAktualniMistnost());
                System.out.print("Kam chceš jít? ");
                String cil = sc.nextLine();
                po.jit(cil);
            }
        } /*catch (IOException e) {
            System.out.println("Chyba při načítání souboru: ");
            */
        catch (Exception e) {
            System.out.println(e);
        }
    }


}