package JavaZaawansowana._02_Super;

public class Computer {
    private String graphicCardModel;
    private double cpuTemperature;

    public Computer(String graphicCardModel, double cpuTemperature) {
        this.graphicCardModel = graphicCardModel;
        this.cpuTemperature = cpuTemperature;
    }

    public String getGraphicCardModel() {
        return graphicCardModel;
    }

    public double getCpuTemperature() {
        return cpuTemperature;
    }
    public void reduceTemperature(){
        cpuTemperature = cpuTemperature - 3;
        // Jest jeszcze zapis:
        // cpuTemperature -=3;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "graphicCardModel='" + graphicCardModel + '\'' +
                ", cpuTemperature=" + cpuTemperature +
                '}';
    }
}
