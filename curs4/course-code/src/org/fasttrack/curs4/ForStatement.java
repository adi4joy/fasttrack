package org.fasttrack.curs4;

public class ForStatement {
    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3});
        System.out.println();
        printArrayForEach(new int[]{1, 2, 3});
        System.out.println();
        printIndexDiv(new int[]{3, 7, 23, 14, 51, 60, 72});
        System.out.println();
        printElements(new int[]{3, 7, 23, 14, 51, 60, 72});
        System.out.println();
        printElements2(new int[]{3, 7, 23, 14, 51, 60, 72});
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

    public static void printIndexDiv(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void printElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void printElements2(int[] arr) {
        for (int elem : arr) {
            if (elem % 2 == 0) {
                System.out.print(elem + " ");
            }
        }

    }
}
