import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Lokace {

    private Map<String, Mistnost> mistnosti =  new HashMap<>();

    public Lokace(String soubor) throws IOException {
        nacistZeSoub(soubor);
    }

    private void nacistZeSoub(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null) {
            String[] split = line.split(";");
            String nazev = split[1];
            mistnosti.putIfAbsent(nazev, new Mistnost(nazev));
            Mistnost aktualni = mistnosti.get(nazev);

            for (int i = 2; i < split.length; i++) {
                mistnosti.putIfAbsent(split[i], new Mistnost(split[i]));
                aktualni.pridatSouseda(mistnosti.get(split[i]));
            }
        }
        br.close();
    }



    public Mistnost getMistnost(String nazev) {
        return mistnosti.get(nazev);
    }

}
