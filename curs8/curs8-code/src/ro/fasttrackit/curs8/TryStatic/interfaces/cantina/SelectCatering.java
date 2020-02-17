package ro.fasttrackit.curs8.TryStatic.interfaces.cantina;

public class SelectCatering implements Catering {
    public void serveFood(String food) {
        System.out.println("Serving " + food + " from Select Catering");
    }
}
