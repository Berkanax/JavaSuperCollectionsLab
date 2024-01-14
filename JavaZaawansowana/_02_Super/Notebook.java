package JavaZaawansowana._02_Super;

public class Notebook  extends Computer{
    public Notebook(String graphicCardModel, double cpuTemperature) {
        super(graphicCardModel, cpuTemperature);
    }
    @Override
    public void reduceTemperature(){
        super.reduceTemperature();
        super.reduceTemperature();
        super.reduceTemperature();
    }
}
