import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Soubory {

    Lokace l = new Lokace(".idea/soub.txt");
    Pohyb po = new Pohyb(l.getMistnost("hala"));
    Predmety pr = new Predmety(po);
    Batoh b = new Batoh();
    Predmet pacidlo = new Predmet("sklep", "pacidlo");
    Predmet klic1 = new Predmet("koupelna", "1. klic");
    Predmet nuz = new Predmet("loznice", "nuz");
    Predmet psiK = new Predmet("kuchyn", "psi krmeni");
    Predmet klic2 = new Predmet("2. detsky pokoj", "2. klic");
    Postavy post = new Postavy(po);
    Postava duch = new Postava("1. detsky pokoj", "duch", false, "Uz jsi nasel 1. klic? Mel by byt v koupelne" +
            "\n Pomoci neho otevres tajnou mistnost pripojenou k loznici", b);
    Postava bailie = new Postava("1. tajna mistnost", "Bailie", false, false);
    Postava james = new Postava("2. tajna mistnost", "James", true, "vetaaaaaa", b);
    //String hledanyPredmet = "psi krmeni";


    public void add() {
        pr.add(pacidlo);
        pr.add(klic1);
        pr.add(klic2);
        pr.add(nuz);
        pr.add(psiK);
        post.add(duch);
        post.add(bailie);
        post.add(james);
    }


    AplikacePouzitiPredmetu bedna = new AplikacePouzitiPredmetu("jidelna", po, pr, b, post, l);


    Konzole k = new Konzole(po, pr, b, post, bedna);

    public Soubory() throws IOException {
    }


    public void save(String fileName){
        List<Serializable> gameState = new ArrayList<>();

        gameState.add((Serializable) l);
        gameState.add((Serializable) po);
        gameState.add((Serializable) pr);
        gameState.add((Serializable) b);
        gameState.add((Serializable) pacidlo);
        gameState.add((Serializable) klic1);
        gameState.add((Serializable) psiK);
        gameState.add((Serializable) klic2);
        gameState.add((Serializable) nuz);
        gameState.add((Serializable) post);
        gameState.add((Serializable) bedna);
        gameState.add((Serializable) james);
        gameState.add((Serializable) duch);
        gameState.add((Serializable) bailie);
        gameState.add((Serializable) k);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(gameState);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void load(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Serializable> gameState = (List<Serializable>) ois.readObject();
            l = (Lokace) gameState.get(0);
            po = (Pohyb) gameState.get(1);
            pr = (Predmety) gameState.get(2);
            b = (Batoh) gameState.get(3);
            pacidlo = (Predmet) gameState.get(4);
            klic1 = (Predmet) gameState.get(5);
            psiK = (Predmet) gameState.get(6);
            klic2 = (Predmet) gameState.get(7);
            nuz = (Predmet) gameState.get(8);
            post = (Postavy) gameState.get(9);
            bedna = (AplikacePouzitiPredmetu) gameState.get(10);
            james = (Postava) gameState.get(11);
            duch = (Postava) gameState.get(12);
            bailie = (Postava) gameState.get(13);
            k = (Konzole) gameState.get(14);

            add();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
