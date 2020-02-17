package ro.fasttrackit.curs6.Homework;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Cel mai mare numar este: " + numereIntregi(1, 2));
    }

    public static int numereIntregi(int a, int b) {
        if (a > b) {
            return a;
        } else
            return b;
    }
}
