package ro.fasttrackit.curs8.TryStatic.interfaces;

public class TruckGarbageCollector implements GarbageCollector {
    private int numberOfTrucks;

    public void pickUp(String garbage) {

        System.out.println("Picking up with trucks");
    }

    public int getNumberOfTrucks() {
        return numberOfTrucks;
    }

}
