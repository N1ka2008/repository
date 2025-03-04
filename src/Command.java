public class Command {

    protected String prikaz;

    public void setPrikaz(String prikaz) {
        this.prikaz = prikaz;
    }

    public String execute() {
        return null;
    }
    public boolean exit() {
        return false;
    }
}
