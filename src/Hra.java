import java.io.IOException;

/**
 * Trida pro logiku
 */
public class Hra {

    public Hra() throws IOException {
    }

        Lokace l = new Lokace(".idea/soub.txt");
        Pohyb po = new Pohyb(l.getMistnost("hala"));
        Predmety pr = new Predmety(po);
        Batoh b = new Batoh();
        Predmet fotoaparat = new Predmet("fotoaparat");
        Predmet pacidlo = new Predmet("sklep", "pacidlo");
        Predmet klic1 = new Predmet("koupelna", "1. klic");
        Predmet nuz = new Predmet("loznice", "nuz");
        Predmet psiK = new Predmet("kuchyn", "psi krmeni");
        Predmet klic2 = new Predmet("2. detsky pokoj", "2. klic");
        Postavy post = new Postavy(po);
        Postava duch = new Postava("1. detsky pokoj", "duch", false, "Uz jsi nasel 1. klic? Mel by byt v koupelne" +
                "\n Pomoci neho otevres tajnou mistnost pripojenou k loznici", b);
        Postava bailie = new Postava("1. tajna mistnost", "Bailie", false, false);
        Postava james = new Postava("2. tajna mistnost", "James", true, "Ja te najdu", b);

    AplikacePouzitiPredmetu bedna = new AplikacePouzitiPredmetu("jidelna", po, pr, b, post, l);

    Konzole k = new Konzole(po, pr, b, post, bedna);

    Soubory s = new Soubory();


    public void hra() throws IOException {

        pr.add(pacidlo);
        pr.add(klic1);
        pr.add(klic2);
        pr.add(nuz);
        pr.add(psiK);
        post.add(duch);
        post.add(bailie);
        post.add(james);

        s.instrukce("text");

        System.out.println("Zacinas v mistnosti: " + po.getAktualniMistnost());
        s.cteni("text");
        b.pridatDoBatohu(fotoaparat);
        try {
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
                bedna.pouzitiPsihoKrm(bailie);
                james.souboj();


            } while (k.start() == true && post.isKonecHry());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

