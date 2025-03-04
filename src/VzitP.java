public class VzitP extends Command {

    public String execute(Predmet p) {
        if(p.isJeVMistnosti() == true){
            p.setJeVzaty(true);
        }
        return "Vazali jste predmet" + p.getNazevPr();
    }

    public boolean exit() {
        return false;
    }
}
