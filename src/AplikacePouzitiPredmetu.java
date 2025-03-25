public class AplikacePouzitiPredmetu {


    private String nachaziSe;

    private Pohyb po;

    private PouzitPredm pouz;

    private Postava post;

    private Mistnost m;

    //private NakrmitBailie nakr;

    //private JitDoMistn ji;

    public AplikacePouzitiPredmetu(String nachaziSe, Pohyb po, Predmety p) {
        this.nachaziSe = nachaziSe;
        this.po = po;
        //this.b = b;
        this.pouz = new PouzitPredm(p);
        //this.nakr = new NakrmitBailie(p);
        //this.ji = new JitDoMistn(po);
    }


    public AplikacePouzitiPredmetu(String nachaziSe, Pohyb po, Predmety p, Postava post) {
        this.nachaziSe = nachaziSe;
        this.po = po;
        //this.b = b;
        this.pouz = new PouzitPredm(p);
        this.post = post;
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


    public String pouzitPac(){
        if(pouz.execute("Pouzit pacidlo")) {
            return "V bedne jsi nasel fotku rodiny";
        }
        return null;
    }

    public String pouzitFotoaparat(){
        if(pouz.execute("Pouzit fotoaparat")) {
           return "Poridil jsi fotografii";
        }
        return null;
    }

    public String pouzitiPsihoKrm(){
        if(post.isJeOchocena() == true && po.getAktualniMistnost().equalsIgnoreCase("sklep")){
            return "Vidis Bailie skrabat na stenu, mozna se tam skryva dalsi tajna mistnost";
        }
        return null;
    }

    public void pouzitiKlice1(){
        if(pouz.execute("Pouzit klic") && po.getAktualniMistnost().equalsIgnoreCase("loznice")) {
            po.jit("1 tajna mistnost");
        }
    }

    public void pouzitiKlice2(){
        if(pouz.execute("Pouzit 2. klic") && po.getAktualniMistnost().equalsIgnoreCase("sklep")) {
            po.jit("2 tajna mistnost");
        }
    }

    private Batoh b;




}
