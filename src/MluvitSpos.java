public class MluvitSpos extends Command{

    private Postava pos;
    private Pohyb po;

    public MluvitSpos(Postava pos, Pohyb po) {
        this.pos = pos;
        this.po = po;
    }

    public boolean execute(String argument){
        if (pos.isJeVMistnosti() && pos.getJmeno().equalsIgnoreCase("duch")){
            System.out.println(pos.getMonolog());
        }else {
            System.out.println("S touto postavou nemuzes mluvit");
        }
        return true;
    }

    public boolean exit() {
        return false;
    }


}
