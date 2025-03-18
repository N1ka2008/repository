import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        //Hra h = new Hra();


        Lokace l = new Lokace(".idea/soub.txt");
        Pohyb po = new Pohyb(l.getMistnost("hala"));
        Predmety pr = new Predmety(po);
        Predmet pacidlo = new Predmet("koupelna", "pacidlo");
        Postavy post = new Postavy(po);
        Postava duch = new Postava("kuchyn", "duch", false, "Veta.....................................   ");
        Batoh b = new Batoh();

        pr.add(pacidlo);
        post.add(duch);


        Konzole k = new Konzole(po, pacidlo, pr, b, post, duch);


        do {
            k.start();
            System.out.println(pacidlo.jeVMistnosti(po.getAktualniMistnost()));
            pr.vypis();
            System.out.println(duch.jeVMistnosti(po.getAktualniMistnost()));
            post.vypis();

        }while (k.start() == true);

    }


}