import java.io.IOException;

public class Hra {

    Postava p = new Postava("hala");
    Lokace l = new Lokace(".idea/soub.txt");
    Pohyb po = new Pohyb(l.getMistnost("hala"));
    Konzole k = new Konzole();
    Predmet pr = new Predmet("hala");

    public Hra() throws IOException {
    }
}
