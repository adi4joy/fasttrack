package ro.fasttrackit.curs9.inheritance;

public class MountainBike extends CityBike {
    private int gears;

    public MountainBike(String color, int gears) {
        super(color);
        if (gears > 0 && gears < 20) {
            this.gears = gears;
        } else {
            this.gears = 7;
        }
    }

    public int getGears() {
        return gears;
    }

    @Override
    public String toString() {
        String bikeString = super.toString().replaceAll("Bike", "MountainBike");
        return bikeString.substring(0, bikeString.length() - 1) +
                ", gears=" + gears +
                '}';
    }
}
