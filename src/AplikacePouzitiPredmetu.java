public class AplikacePouzitiPredmetu {


    private String nachaziSe;

    private Pohyb po;

    private PouzitPredm pouz;

   // private Predmet p;



    public AplikacePouzitiPredmetu(String nachaziSe, Pohyb po, Predmet p) {
        this.nachaziSe = nachaziSe;
        this.po = po;
        //this.b = b;
        this.pouz = new PouzitPredm(p);
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



    private Batoh b;



    public void pouzitPac(){
        if(pouz.execute("Pouzit pacidlo")) {
            System.out.println("V bedne jsi nasel fotku rodiny");
        }

    }

}
