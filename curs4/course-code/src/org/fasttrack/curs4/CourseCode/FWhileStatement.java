package org.fasttrack.curs4.CourseCode;

public class FWhileStatement {
    public static void main(String[] args) {
        printEvenNumbers(10);
    }

    public static void printNumbers(int n) {
        int index = 0;
        while (index < n) {
            System.out.println(index);
            index++;
        }
    }

    public static void printEvenNumbers(int n) {
        int index = 0;
        while (index < n) {
            System.out.println(index);
            index = index + 2;
        }
    }
}
