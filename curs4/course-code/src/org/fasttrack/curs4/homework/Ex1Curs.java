package org.fasttrack.curs4.homework;

public class Ex1Curs {
    public static void main(String[] args) {
        printArray(new String[]{"abc", "def", "ghi"});
        int[] returnSum = {1, 3, 5, 7};
        sum(returnSum);
        System.out.println(sum(returnSum));
    }

    public static void printArray(String[] strings) {
        for (int i = 0; i < strings.length - 1; i++) {
            System.out.print(strings[i] + " - ");
        }
        System.out.println(strings[strings.length - 1]);
    }

    public static int sum(int[] returnSum) {
        int suma = 0;
        for (int number : returnSum) {
            suma = suma + number;
        }
        return suma;
    }
}
