package ro.fasttrackit.curs6.Homework;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Numerele din sir mai mari decat numarul primit sunt: " + sirNumereIntregi(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
    }

    public static int sirNumereIntregi(int[] array, int a) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean condition;
            condition = array[i] > a;
            if (condition) {
                return (array[i]++);
            }
        }
        return (array[array.length - 1]);
    }
}
