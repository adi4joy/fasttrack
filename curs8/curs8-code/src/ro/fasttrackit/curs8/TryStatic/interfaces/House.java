package ro.fasttrackit.curs8.TryStatic.interfaces;

public class House {
    private String name;
    private GarbageCollector collector;

    public House(String name, GarbageCollector collector) {
        this.name = name;
        this.collector = collector;
    }

    public void cleanUp() {
        System.out.println("Cleaning house " + name);
        collector.pickUp("Garbage from " + name);
    }
}
