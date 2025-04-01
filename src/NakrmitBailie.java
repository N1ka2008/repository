public class NakrmitBailie extends Command{

    private Postavy pos;
    private Batoh b;
    private String hledanyPredmet;

    public NakrmitBailie(Postavy pos, Batoh b) {
        this.pos = pos;
        this.b = b;
    }

    public NakrmitBailie(Postavy pos, Batoh b, String hledanyPredmet) {
        this.pos = pos;
        this.b = b;
        this.hledanyPredmet = hledanyPredmet;
    }

    public NakrmitBailie(Predmet p) {
        super();
    }

    public boolean execute(String argument) {
       /* for(Postava post : pos.postavy) {
            for (Predmet p : b.getPredmety()) {
                if (p.getNazev().equals(hledanyPredmet) && post.getJmeno().equalsIgnoreCase("Bailie")) {
                    System.out.println("ochocil jsi si Bailie");
                    post.setJeOchocena(true);
                    System.out.println("Bailie te vede do sklepa nasleduj ji");
                } else {
                    System.out.println("Musis najit psi krmeni");
                }
            }
        }

        */
        boolean bailieNalezena = false;
        boolean predmetNalezen = false;

        Postava bailie = null;
        for (Postava post : pos.postavy) {
            if (post.getJmeno().equalsIgnoreCase("Bailie")) {
                bailieNalezena = true;
                bailie = post;
                break;
            }
        }

        if (bailieNalezena) {
            for (Predmet p : b.getPredmety()) {
                if (p.getNazevPr().equals(hledanyPredmet)) {
                    System.out.println("Ochocil jsi si Bailie");
                    bailie.setJeOchocena(true);
                    System.out.println("Bailie te vede do sklepa nasleduj ji");
                    predmetNalezen = true;
                    return true;
                }
            }
            if (!predmetNalezen) {
                System.out.println("Musis najit psi krmeni");
            }
        } else {
            System.out.println("Bailie neni k dispozici");
        }
            return true;

    }

    public boolean exit() {
        return false;
    }
}
