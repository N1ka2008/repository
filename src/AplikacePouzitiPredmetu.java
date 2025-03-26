public class AplikacePouzitiPredmetu {


    private String nachaziSe;

    private Pohyb po;

    private PouzitPredm pouz;

    private Postavy post;

    //private Mistnost m;

    private Lokace lo;

    private Batoh b;

    //private NakrmitBailie nakr;

    //private JitDoMistn ji;

    public AplikacePouzitiPredmetu(String nachaziSe, Pohyb po, Predmety p, Batoh b, Postavy post, Lokace lo) {
        this.nachaziSe = nachaziSe;
        this.po = po;
        this.b = b;
        this.post = post;
        this.pouz = new PouzitPredm(p, b, this, post);
        this.lo = lo;
        //this.nakr = new NakrmitBailie(p);
        //this.ji = new JitDoMistn(po);
    }


    public boolean bedna(){
       // System.out.println(po.getAktualniMistnost());
        //System.out.println("aaakkkk");
        if(nachaziSe.equalsIgnoreCase(po.getAktualniMistnost())){
            System.out.println("V teto mistnosti vidis bednu s pribitym vikem");
            return true;
        }
        return false;
    }


    public Boolean pouzitPac(){
            if (pouz.execute("Pouzit pacidlo")) {
                System.out.println("V bedne jsi nasel fotku rodiny");
                return true;
            }
        return false;
    }

    public Boolean pouzitFotoaparat(){
            if (pouz.execute("Pouzit fotoaparat")) {
                System.out.println("Poridil jsi fotografii");
                return true;
            }
        return false;
    }

    public Boolean pouzitiPsihoKrm(){
        for(Postava pos : post.postavy) {
            if (pos.getJmeno().equalsIgnoreCase("Bailie") && pos.isJeOchocena() == true && po.getAktualniMistnost().equalsIgnoreCase("sklep")) {
                System.out.println("Vidis Bailie skrabat na stenu, mozna se tam skryva dalsi tajna mistnost");
                return true;
            }
        }
        return false;
    }

    public void pouzitiKlice1(){
        if(pouz.execute("Pouzit 1. klic") && po.getAktualniMistnost().equalsIgnoreCase("loznice")) {
            //po.jit("1. tajna mistnost");
            po.setAktualniMistnost(lo.getMistnost("1. tajna mistnost"));
            System.out.println("Aktualni mistnost: " + po.getAktualniMistnost());
        }
    }

    public void pouzitiKlice2(){
        if(pouz.execute("Pouzit 2. klic") && po.getAktualniMistnost().equalsIgnoreCase("sklep")) {
            //po.jit("2. tajna mistnost");
            po.setAktualniMistnost(lo.getMistnost("2. tajna mistnost"));
            System.out.println("Aktualni mistnost: " + po.getAktualniMistnost());
        }
    }






}
