package org.fasttrack.curs4.CourseCode;

public class FForStatement {
    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3});
        System.out.println();
        printArrayForEach(new int[]{1, 2, 3});
    }

    public static void printArrayForEach(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
