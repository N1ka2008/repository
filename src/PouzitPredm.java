public class PouzitPredm extends Command{

    private Predmet p;
    private Batoh b;
    private AplikacePouzitiPredmetu pac;

    public PouzitPredm(Predmet p, Batoh b, AplikacePouzitiPredmetu pac) {
        this.p = p;
        this.b = b;
        this.pac = pac;
    }

    public PouzitPredm(Predmet p) {
        this.p = p;
        //this.b = b;
    }

    public boolean execute(String argument){
        if(b.predmety.contains(p) && p.getNazevPr().equalsIgnoreCase(argument)){
            System.out.println("Predmet pouzit");
            b.predmety.remove(p);
            if(pac.bedna() == true){
                pac.pouzitPac();
            }
        }else{
            System.out.println("tento predmet nemate");
        }
        return true;
    }

    public boolean exit() {
        return false;
    }
}
