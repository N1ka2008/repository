package tridy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Trida pro zjisteni lokace
 */
public class Lokace {

    private Map<String, Mistnost> mistnosti =  new HashMap<>();

    public Lokace(String soubor) throws IOException {
        nacistZeSoub(soubor);
    }

    /**
     * metoda nacte mapu z textoveho souboru, rozdeli jednotlive mitnosti pomoci ";". Dale zjisti jestli
     * mistnost existuje a jake ma sousedni mistnosti.
     * zdroj: chat GPT
     */
    private void nacistZeSoub(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null) {
            String[] split = line.split(";");
            String nazev = split[1];
            if (!mistnosti.containsKey(nazev)) {
                mistnosti.put(nazev, new Mistnost(nazev));
            }
            Mistnost aktualni = mistnosti.get(nazev);

            for (int i = 2; i < split.length; i++) {
                if (!mistnosti.containsKey(split[i])) {
                    mistnosti.put(split[i], new Mistnost(split[i]));
                }
                aktualni.pridatSousedni(mistnosti.get(split[i]));
            }
        }
        br.close();
    }

    public Mistnost getMistnost(String nazev) {
        return mistnosti.get(nazev);
    }

}
