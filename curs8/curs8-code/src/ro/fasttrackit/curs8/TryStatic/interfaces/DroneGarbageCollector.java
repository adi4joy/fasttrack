package ro.fasttrackit.curs8.TryStatic.interfaces;

public class DroneGarbageCollector implements GarbageCollector {
    public void pickUp(String garbage) {
        System.out.println("Drone the garbage away! " + garbage);
    }
}
