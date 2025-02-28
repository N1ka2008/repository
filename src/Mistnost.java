import javax.xml.stream.Location;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Mistnost {

    String nazev;
    List<Mistnost> sousedni = new ArrayList<>();

    public Mistnost(String nazev) {
        this.nazev = nazev;
    }

    public void pridatSouseda(Mistnost mistnost) {
        sousedni.add(mistnost);
    }

    

   /* private HashMap<String, Location> svet = new HashMap<>();
    private int start = 0;
    private int pozice = start;

    public boolean nacistMapu() {
        try (BufferedReader br = new BufferedReader(new FileReader("soub.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(";");
                Location loc = new Location(

                        Integer.parseInt(),
                        Arrays.copyOfRange()
                );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    */

}
