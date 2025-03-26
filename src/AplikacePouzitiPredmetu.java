public class AplikacePouzitiPredmetu {


    private String nachaziSe;

    private boolean jeBednaOtevrena = false;

    private Pohyb po;

    private PouzitPredm pouz;

    private Postavy post;

    private Lokace lo;

    private Batoh b;

    public AplikacePouzitiPredmetu(String nachaziSe, Pohyb po, Predmety p, Batoh b, Postavy post, Lokace lo) {
        this.nachaziSe = nachaziSe;
        this.po = po;
        this.b = b;
        this.post = post;
        this.pouz = new PouzitPredm(p, b, this, post);
        this.lo = lo;
    }


    public boolean bedna(){
        if(nachaziSe.equalsIgnoreCase(po.getAktualniMistnost()) && !isJeBednaOtevrena()){
            System.out.println("V teto mistnosti vidis bednu s pribitym vikem");
            return true;
        } else {
            return false;
        }
    }


    public String pouzitPac(){
        setJeBednaOtevrena(true);
                return "V bedne jsi nasel fotku rodiny";
    }

    public String pouzitFotoaparat(){
             return "Poridil jsi fotografii";
    }

    public String pouzitiPsihoKrm(){
        for(Postava pos : post.postavy) {
            if (pos.getJmeno().equalsIgnoreCase("Bailie") && pos.isJeOchocena() == true && po.getAktualniMistnost().equalsIgnoreCase("sklep")) {
                return "Vidis Bailie skrabat na stenu, mozna se tam skryva dalsi tajna mistnost";

            }
        }
        return null;
    }

    public void pouzitiKlice1(){
        if(pouz.execute("Pouzit 1. klic") && po.getAktualniMistnost().equalsIgnoreCase("loznice")) {
            po.setAktualniMistnost(lo.getMistnost("1. tajna mistnost"));
            System.out.println("Aktualni mistnost: " + po.getAktualniMistnost());
        }
    }

    public void pouzitiKlice2(){
        if(pouz.execute("Pouzit 2. klic") && po.getAktualniMistnost().equalsIgnoreCase("sklep")) {
            po.setAktualniMistnost(lo.getMistnost("2. tajna mistnost"));
            System.out.println("Aktualni mistnost: " + po.getAktualniMistnost());
        }
    }

    public boolean isJeBednaOtevrena() {
        return jeBednaOtevrena;
    }

    public void setJeBednaOtevrena(boolean jeBednaOtevrena) {
        this.jeBednaOtevrena = jeBednaOtevrena;
    }
}
