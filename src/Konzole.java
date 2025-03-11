import java.util.HashMap;
import java.util.Scanner;

public class Konzole {

    Scanner sc = new Scanner(System.in);

    private boolean exit = false;
    private HashMap<String, Command> mapa = new HashMap<>();

    public void inicializace() {
        mapa.put("Jit ", new JitDoMistn());
        mapa.put("Mluvit ", new MluvitSpos());
        mapa.put("Nakrmit ", new NakrmitBailie());
        mapa.put("Pouzit ", new PouzitPredm());
        mapa.put("Vzit ", new VzitP());
        mapa.put("Exit ", new Exit());
    }



    private void proved(){
        System.out.println(">> ");
        String prikaz = sc.nextLine();
    }

    public void start() {
        inicializace();
        try {
            do {
                proved();
            } while (!exit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
