package ro.fasttrackit.curs6;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(intArray(new int[]{15, 23, 5, 1, 2}));
        System.out.println(intNumerePare(new int[]{15, 23, 5, 12, 2}));
        System.out.println(intNumereImpare(new int[]{15, 23, 5, 12, 2}));

    }

    public static int intArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int intNumerePare(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
    public static int intNumereImpare(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i]%2!=0) {
                sum = ++sum;
            }
        }
        return sum;
    }

}
