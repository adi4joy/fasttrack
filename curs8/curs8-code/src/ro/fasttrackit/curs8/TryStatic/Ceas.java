package ro.fasttrackit.curs8.TryStatic;

public class Ceas {
    public static int COUNT = 0;
    private String color;
    public int n = 0;

    public Ceas(String color) {
        this.color = color;
        COUNT++;
        n++;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Ceas " + color;
    }
}
