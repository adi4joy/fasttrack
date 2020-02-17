package ro.fasttrackit.curs7;

public class Therm {
    private boolean heatOn;
    private int targetTemp;
    private int crtTemp;

    public Therm(int temp) {
        crtTemp = temp;
        setTargetTemp(temp);
    }

    public boolean isHeatOn() {
        return heatOn;
    }

    public int getCrtTemp() {
        return crtTemp;
    }

    public int getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(int temp) {
        targetTemp = temp;
        if (targetTemp > crtTemp) {
            heatOn = true;
        } else {
            heatOn = false;
        }
    }

    public String toString() {
        return "target: " + targetTemp + "; crt: " + crtTemp + "; heat: " + heatOn;
    }

}
