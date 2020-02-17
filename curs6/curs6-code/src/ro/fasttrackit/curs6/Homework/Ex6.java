package ro.fasttrackit.curs6.Homework;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Suma elementelor pare este: " + sirNumereIntregi(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static int sirNumereIntregi(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
