/**
 * Commands
 */
public abstract class Command {

    protected String prikaz;

    public void setPrikaz(String prikaz) {
        this.prikaz = prikaz;
    }


    public boolean exit() {
        return false;
    }

    public abstract boolean execute(String argument);
}
