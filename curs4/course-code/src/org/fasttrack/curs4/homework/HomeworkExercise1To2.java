package org.fasttrack.curs4.homework;

public class HomeworkExercise1To2 {
    public static void main(String[] args) {
        namesArray(new String[]{"Adi", "Alexandra", "Lisa", "Sara", "Raya"});
        System.out.println();
        intArray(new int[]{12, 23, 45, 67, 89});
    }

    //Exercise 1
    public static void namesArray(String[] arr) {
        for (String elem : arr) {
            System.out.print(elem + "-");
        }
    }

    // Exercise 2
    public static void intArray(int[] arr) {
        int i;
        int sum = 0;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println("The sum of the elements is " + sum);
    }

}