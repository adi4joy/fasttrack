package ro.fasttrackit.curs7;

public class Lamp {
    private boolean lightOn;

    public Lamp() {
        lightOn = false;
    }

    public Lamp(boolean initial) {
        lightOn = initial;
    }

    public void turnOn() {
        lightOn = true;
    }

    public void turnOff() {
        lightOn = false;
    }

    public boolean isLightOn(){
        return lightOn;
    }
}
