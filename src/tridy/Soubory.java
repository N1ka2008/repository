package tridy;

import java.io.*;

public class Soubory {

    /**
     * Soubor pro zapsani instrukci
     */
    public void instrukce(String text){
        String obsah = "Dostupne commandy: 'Pouzit' pro pouziti predmetu. 'Jit' pro pohyb do dalsi mistnosti.";
        String obsah2 = "'Vzit' pro vzati predmetu. 'Nakrmit' pro nakrmeni postav. 'Mluvit' pro mluveni s postavou.";
        String obsah3 =  "'Zobrazit' pro zobrazeni batohu.'command.Exit' pro ukonceni hry";

        String mistnosti = "Mistnosti na 1. patre: hala, koupelna, kuchyn, jidelna";
        String mistnosti2 = "Mistnosti na 2. patre: chodba, 1. detsky pokoj, 2. detsky pokoj, loznice";
        String mistnosti3 = "Schodistem se dostanes do dalsiho patra a do sklepa";
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(text))) {
            wr.write(obsah);
            wr.newLine();
            wr.write(obsah2);
            wr.newLine();
            wr.write(obsah3);
            wr.newLine();
            wr.write(mistnosti);
            wr.newLine();
            wr.write(mistnosti2);
            wr.newLine();
            wr.write(mistnosti3);
            wr.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Soubor pro precteni instrukci
     */
    public void cteni(String text){
        try(BufferedReader rd = new BufferedReader(new FileReader(text))){
            String obsah = rd.readLine();
            String obsah2 = rd.readLine();
            String obsah3 = rd.readLine();
            String mistnosti = rd.readLine();
            String mistnosti2 = rd.readLine();
            String mistnosti3 = rd.readLine();
            System.out.println(obsah + "\n" + obsah2 + "\n" + obsah3 + "\n\n" + mistnosti + "\n" + mistnosti2 + "\n" + mistnosti3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Soubor pro zacatek prubehu
     */
    public void Zacatek(String text){
        String story = "Jsi detektiv, ktery ma za ukol jit do domu ve kterem zahadne zmizela rodina.";
        String story2 = "Musis zjistit kdo ma zmizeni na svedomi a pripadne najit prezivsi";
        String story3 = "Projdi vsechny mistnosti, pozbirej predmety a vyhraj hru. Startovni predmet: fotoaparat";
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(text))) {
            wr.write(story);
            wr.newLine();
            wr.write(story2);
            wr.newLine();
            wr.write(story3);
            wr.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Soubor pro nacteni pribehu
     */
    public void cteni2(String text){
        try(BufferedReader rd = new BufferedReader(new FileReader(text))){
            String story = rd.readLine();
            String story2 = rd.readLine();
            String story3 = rd.readLine();
            System.out.println(story + "\n" + story2 + "\n\n" + story3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
