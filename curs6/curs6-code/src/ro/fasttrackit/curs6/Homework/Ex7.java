package ro.fasttrackit.curs6.Homework;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Numarul de elemente impare este: " + sirNumereIntregi(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static int sirNumereIntregi(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
