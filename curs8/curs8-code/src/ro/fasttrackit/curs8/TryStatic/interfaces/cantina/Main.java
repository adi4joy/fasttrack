package ro.fasttrackit.curs8.TryStatic.interfaces.cantina;

public class Main {
    public static void main(String[] args) {
        Catering select = new SelectCatering();
        Catering flavors = new FlavorsCatering();

//        new Canteen(flavors).deliverFood();
        new Canteen(select).deliverFood();
    }
}
