package ro.fasttrackit.curs6.Homework;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Targetul de donatii este: ");
        int target = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int amount = 0;
            int donation = random.nextInt(10_000);
            if (donation > 0 && target > amount) {
                amount += donation;
            }
            System.out.println("S-a strans in total " + amount);
        }
        System.out.println("Success!");

    }
}
