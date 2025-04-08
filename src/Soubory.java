import java.io.*;

public class Soubory {

    public void instrukce(String text){
        String obsah = "Dostupne commandy: 'Pouzit' pro pouziti predmetu. 'Jit' pro pohyb do dalsi mistnosti." +
                " 'Vzit' pro vzati predmetu. 'Nakrmit' pro nakrmeni postav. 'Mluvit' pro mluveni s postavou. 'Zobrazit' pro zobrazeni batohu." +
                "'Exit' pro ukonceni hry";

        try (BufferedWriter wr = new BufferedWriter(new FileWriter(text))) {
            wr.write(obsah);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void cteni(String text){
        try(BufferedReader rd = new BufferedReader(new FileReader(text))){
            String obsah = rd.readLine();
            System.out.println(obsah);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
