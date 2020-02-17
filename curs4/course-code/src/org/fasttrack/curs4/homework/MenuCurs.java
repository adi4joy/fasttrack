package org.fasttrack.curs4.homework;

import java.util.Scanner;

public class MenuCurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            printMenu();
            System.out.print("Introduceti optiunea: ");
            option = scanner.nextInt();
        } while (option != 6);
        System.out.println(getOption(option));

    }

    public static void printMenu() {
        System.out.println("1) Pizza");
        System.out.println("2) Cheeseburger");
        System.out.println("3) Soup");
        System.out.println("4) Fish&Chips");
        System.out.println("5) Sarmale");
        System.out.println("6) Exit");
    }

    public static String getOption(int option) {
        switch (option) {
            case 1:
                return "You ordered Pizza";
            case 2:
                return "You ordered Cheeseburger";
            case 3:
                return "You ordered Soup";
            case 6:
                return "Exit";
            default:
                return "Error";
        }
    }
}
