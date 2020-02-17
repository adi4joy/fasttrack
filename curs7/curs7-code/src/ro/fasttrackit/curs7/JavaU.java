package ro.fasttrackit.curs7;

import java.util.Scanner;

public class JavaU {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println((firstNumber / 2) + (firstNumber % 2) + (secondNumber / 2) + (secondNumber % 2) + (thirdNumber / 2) + (thirdNumber % 2));
    }
}