package org.fasttrack.curs4;

public class WhileStatement {
    public static void main(String[] args) {
        printNumbers(10);

        printEverySecondNumber(10);
    }

    public static void printNumbers(int n) {
        int index = 0;
        while (index < n) {
            System.out.println(index);
            index++;
        }
    }

    public static void printEverySecondNumber(int n) {
        int index = 0;
        while (index < n) {
            System.out.println(index);
            index += 2;
            // index = index + 2;
        }
    }
}
