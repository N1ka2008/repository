package command;

import tridy.Batoh;

/**
 * command.Command Zobrazit
 */
public class ZobrazitBatoh extends Command {

    private Batoh b;

    public ZobrazitBatoh(Batoh b) {
        this.b = b;
    }

    @Override
    public boolean execute(String argument) {
        if(!(b.getPredmety() == null)){
            b.vypsatObsah();
        }
        return true;
    }

    public boolean exit () {
        return false;
    }

}
