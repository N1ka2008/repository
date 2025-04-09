package command;

import tridy.Pohyb;
import tridy.Postava;
import tridy.Postavy;

/**
 * Command Mluvit
 */
public class MluvitSpos extends Command {

    private Postavy pos;
    private Pohyb po;

    public MluvitSpos(Postavy pos, Pohyb po) {
        this.pos = pos;
        this.po = po;
    }

    public boolean execute(String argument){
        for(Postava post : pos.postavy) {
            if (post.isJeVMistnosti() && post.getJmeno().equalsIgnoreCase("duch")) {
                System.out.println(post.getMonolog());
                return true;
            }
        }
        System.out.println("S touto postavou nemuzes mluvit");
        return false;
    }

    public boolean exit() {
        return false;
    }
}
