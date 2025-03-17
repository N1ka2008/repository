import java.io.IOException;

public class PouzitPredm extends Command{

    private Predmet p;
    private Batoh b;

    public PouzitPredm(Predmet p, Batoh b) {
        this.p = p;
        this.b = b;
    }

    public boolean execute(String argument){
        if(b.predmety.contains(p) && p.getNazevPr().equalsIgnoreCase(argument)){
            System.out.println("Predmet pouzit");
            b.predmety.remove(p);
        }
        return true;
    }

    public boolean exit() {
        return false;
    }
}
