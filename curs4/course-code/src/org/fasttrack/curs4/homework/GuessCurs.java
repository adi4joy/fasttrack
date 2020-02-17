package org.fasttrack.curs4.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessCurs {
    public static void main(String[] args) {
        Random random = new Random();
        boolean success;
        int randomNumber = random.nextInt(20) + 1;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            System.out.print("Introdu numarul tau: ");
            int userNumber = scanner.nextInt();
            success = userNumber == randomNumber;
            if (success) {
                System.out.println("Ai ghicit");
            } else if (userNumber < randomNumber) {
                System.out.println("Prea mic");
            } else {
                System.out.println("Prea mare");
            }
            count++;
        } while (!success && count < 5);

    }

}
