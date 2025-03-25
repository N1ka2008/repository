public class NakrmitBailie extends Command{

    private Postava pos;
    private Batoh b;
    //private Predmet po;
    private String hledanyPredmet;

    public NakrmitBailie(Postava pos, Batoh b) {
        this.pos = pos;
        this.b = b;
    }

    public NakrmitBailie(Postava pos, Batoh b, String hledanyPredmet) {
        this.pos = pos;
        this.b = b;
        this.hledanyPredmet = "psi krmeni";
    }

    public NakrmitBailie(Predmet p) {
        super();
    }

    public boolean execute(String argument) {
        for (Predmet p : b.getPredmety()) {
            if (p.getNazev().equals(hledanyPredmet) && pos.getJmeno().equalsIgnoreCase("Bailie")) {
                System.out.println("ochocil jsi si Bailie");
                pos.setJeOchocena(true);
                System.out.println("Bailie te vede do sklepa nasleduj ji");
            } else {
                System.out.println("Musis najit psi krmeni");
            }
        }
            return true;

    }

    public boolean exit() {
        return false;
    }
}
