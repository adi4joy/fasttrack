package ro.fasttrackit.curs9.inheritance;

public class BMX extends Bike {
    private final String trickBar;

    public BMX(String color, int maxSpeed) {
        super(color, maxSpeed);
        this.trickBar = "Pro";
    }

    public String getTrickBar() {
        return trickBar;
    }
}
