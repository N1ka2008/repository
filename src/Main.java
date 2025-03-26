import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        Hra h = new Hra();
        h.hra();

        /*try {

            Lokace l = new Lokace(".idea/soub.txt");
            Pohyb po = new Pohyb(l.getMistnost("hala"));
            Predmety pr = new Predmety(po);
            Predmet pacidlo = new Predmet("Koupelna", "pacidlo");
            Predmet klic1 = new Predmet("koupeln", "1. klic");
            Predmet nuz = new Predmet("loznice", "nuz");
            Predmet psiK = new Predmet("kuchyn", "psi krmeni");
            Predmet klic2 = new Predmet("2. detsky pokoj", "2. klic");
            Postavy post = new Postavy(po);
            Postava duch = new Postava("1. detsky pokoj", "duch", false, "Veta.....................................   ");
            Postava bailie = new Postava("1. tajna mistnost", "Bailie", false, false);
            Postava james = new Postava("2. tajna mistnost", "James", true, "vetaaaaaa");
            Batoh b = new Batoh();


            pr.add(pacidlo);
            pr.add(klic1);
            pr.add(klic2);
            pr.add(nuz);
            pr.add(psiK);
            post.add(duch);
            post.add(bailie);
            post.add(james);

            AplikacePouzitiPredmetu bedna = new AplikacePouzitiPredmetu("jidelna", po, pr, b, post, l);


            Konzole k = new Konzole(po, pr, b, post, bedna);


            do {
                k.start();
                pacidlo.jeVMistnosti(po.getAktualniMistnost());
                klic1.jeVMistnosti(po.getAktualniMistnost());
                klic2.jeVMistnosti(po.getAktualniMistnost());
                nuz.jeVMistnosti(po.getAktualniMistnost());
                psiK.jeVMistnosti(po.getAktualniMistnost());
                pr.vypis();

                bedna.bedna();

            duch.jeVMistnosti(po.getAktualniMistnost());
            bailie.jeVMistnosti(po.getAktualniMistnost());
            james.jeVMistnosti(po.getAktualniMistnost());
            post.vypis();



            } while (k.start() == true);
        } catch (Exception e) {
            System.out.println(e);
        }

         */

    }


}