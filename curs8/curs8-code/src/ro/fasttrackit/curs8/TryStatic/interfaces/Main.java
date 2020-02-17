package ro.fasttrackit.curs8.TryStatic.interfaces;

public class Main {
    public static void main(String[] args) {
        GarbageCollector garbageCollector = new TruckGarbageCollector();
        GarbageCollector droneCollector = new DroneGarbageCollector();
//        House house = new House("white", garbageCollector);
        House house = new House("white", droneCollector);

        house.cleanUp();
    }
}
