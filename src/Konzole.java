import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Konzole {

    Scanner sc = new Scanner(System.in);

    private boolean exit = false;
    private HashMap<String, Command> mapa = new HashMap<>();

    private Pohyb po; // Přidání reference na Pohyb
    private Predmety pr;
    private Predmet p;
    private Batoh b;

    public Konzole(Pohyb po, Predmet p, Predmety pr, Batoh b) throws IOException {
        this.po = po;
        this.p = p;
        this.pr = pr;
        this.b = b;
    }


    public Konzole() throws IOException {
    }


    public void inicializace() throws IOException {
        mapa.put("Jit", new JitDoMistn(po));
        mapa.put("Mluvit", new MluvitSpos());
        mapa.put("Nakrmit", new NakrmitBailie());
        mapa.put("Pouzit", new PouzitPredm(p, b));
        mapa.put("Vzit", new VzitP(p, po, b));
        mapa.put("Exit", new Exit());
        mapa.put("Zobrazit", new ZobrazitBatoh(b));
    }



    private void proved(){
        System.out.println(">> ");
        String vstup = sc.nextLine();
        // Rozdělení vstupu na příkaz a argumenty
        String[] casti = vstup.split(" ", 2);
        String prikaz = casti[0];
        String argument = (casti.length > 1) ? casti[1] : "";

        // Spuštění odpovídajícího příkazu
        Command cmd = mapa.get(prikaz);
        if (cmd != null) {
            cmd.execute(argument);
            if (cmd instanceof Exit) {
                exit = true;
            }
        } else {
            System.out.println("Neznamy prikaz!");
        }
    }

    public boolean start() throws IOException {
        inicializace();
        if(exit == false){
                proved();
                return true;
        }
        else{
            return false;
        }
    }


}
