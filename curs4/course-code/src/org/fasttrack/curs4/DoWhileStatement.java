package org.fasttrack.curs4;

import java.util.Random;

public class DoWhileStatement {
    public static void main(String[] args) {
//        tryRandom(20);
//        doWhileWithWhile(10);
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
        int contor = 0;

        do {
            randNumber = random.nextInt(100);
            System.out.println("Trying " + randNumber + " == " + guess);
            contor++;
        } while (randNumber != guess);
        System.out.println("Number found after " + contor + " tries");
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
