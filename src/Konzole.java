import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Konzole {

    Scanner sc = new Scanner(System.in);

    private boolean exit = false;
    private HashMap<String, Command> mapa = new HashMap<>();

    private Pohyb po;
    //private Predmet klic1;
    private Predmety pr;
    private Predmet p;
    private Batoh b;
    private Postavy post;
    private Postava pos;
    private AplikacePouzitiPredmetu pouz;

    //private PouzitiPacidla pou;

    public Konzole(Pohyb po, Predmety pr, Batoh b, Postavy post, AplikacePouzitiPredmetu pouz) throws IOException {
        this.po = po;
        this.p = p;
        //this.klic1 = klic1;
        this.pr = pr;
        this.b = b;
        this.post = post;
        this.pos = pos;
        this.pouz = pouz;
    }


    public Konzole(Pohyb po, Predmet pacidlo, Predmety pr, Batoh b, Postavy post, Postava duch, Postava bailie, Postava james, AplikacePouzitiPredmetu bedna) throws IOException {
    }


    public void inicializace() throws IOException {
        mapa.put("Jit", new JitDoMistn(po));
        mapa.put("Mluvit", new MluvitSpos(pos, po));
        mapa.put("Nakrmit", new NakrmitBailie(pos, b));
        mapa.put("Pouzit", new PouzitPredm(pr, b, pouz));
        mapa.put("Vzit", new VzitP(pr, po, b));
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
