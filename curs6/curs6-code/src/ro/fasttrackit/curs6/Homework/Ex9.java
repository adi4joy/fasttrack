package ro.fasttrackit.curs6.Homework;

import java.util.Random;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donation target: ");
        int target = scanner.nextInt();
        Random random = new Random();
        int amount = 0;
        do {
            int donation = random.nextInt(10_000);
            if (donation > 0) {
                amount += donation;
            }
            System.out.println("Raised so far: " + amount);
        } while (target >= amount);
        System.out.println("Success!");
    }
}
