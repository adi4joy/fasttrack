package org.fasttrack.curs4.CourseCode;

import java.util.Random;

public class FDoWhileStatement {
    public static void main(String[] args) {
        tryRandom(44);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int pos = 0;
        while (pos < arr.length) {
            System.out.println(arr[pos]);
            pos++;
        }
    }

    public static void tryRandom(int guess) {
        Random random = new Random();
        int randNumber;
        int count = 0;
        do {
            randNumber = random.nextInt(100);
            System.out.println("Trying " + randNumber + " == " + guess);
            count++;
        } while (randNumber != guess);
        System.out.println("Trials: " + count);
    }

    public static void doWhileWithWhile(int guess) {
        Random random = new Random();

        int randNumber = random.nextInt(100);
        System.out.println("Trying " + randNumber + " == " + guess);

        while (randNumber != guess) {
            randNumber = random.nextInt(100);
            System.out.println("Trying " + randNumber + " == " + guess);
        }
    }
}
