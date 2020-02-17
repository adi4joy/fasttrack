package ro.fasttrackit.curs8.TryStatic.interfaces.cantina;

public class Canteen {
    private Catering catering;

    public Canteen(Catering catering) {
        this.catering = catering;
    }

    public void deliverFood() {
        this.catering.serveFood("mamaliga");
        System.out.println("Serving food!");
    }
}
