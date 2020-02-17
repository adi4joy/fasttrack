package org.fasttrack.curs4.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeworkExercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int toGuess = random.nextInt(20);
//        System.out.println(toGuess);
        int number;

        do {
            System.out.print("Introduceti numarul: ");
            number = scanner.nextInt();
            if (number == toGuess) {
                System.out.println("Ai ghicit");
            } else {
                System.out.println("Mai incearca");
            }

        } while (number != toGuess);
    }
}
