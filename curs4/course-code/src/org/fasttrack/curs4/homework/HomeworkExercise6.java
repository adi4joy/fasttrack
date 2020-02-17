package org.fasttrack.curs4.homework;

import java.util.Scanner;

public class HomeworkExercise6 {

    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);

        do {
            startMenu();
            option = scanner.nextInt();
            printOption(option);
        } while (option != 6);

    }

    public static void startMenu() {
        System.out.println("This is our fabulous menu:");
        System.out.println("1) Pizza");
        System.out.println("2) Cheeseburger");
        System.out.println("3) Soup");
        System.out.println("4) Fish&Chips");
        System.out.println("5) Sarmale");
        System.out.println("6) Exit");

        System.out.print("Please enter your choice: ");
    }

    public static void printOption(int option) {
        switch (option) {
            case 1:
                System.out.println("You ordered Pizza. Thank you!");
                break;
            case 2:
                System.out.println("You ordered Cheeseburger. Thank you!");
                break;
            case 3:
                System.out.println("You ordered Soup. Thank you!");
                break;
            case 4:
                System.out.println("You ordered Fish&Chips. Thank you!");
                break;
            case 5:
                System.out.println("You ordered Sarmale. Thank you!");
                break;
            case 6:
                System.out.println("Exit!");
                break;
            default:
                System.out.println("This is an error! Try again.");
        }
    }
}