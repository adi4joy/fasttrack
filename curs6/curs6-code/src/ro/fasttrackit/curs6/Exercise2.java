package ro.fasttrackit.curs6;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
//        System.out.println("The sum is " + sum(2, 7));
        sum2();
    }

    public static int sum(int param1, int param2) {
        return param1 + param2;
    }

    public static void sum2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int param1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int param2 = scanner.nextInt();
        System.out.println("The new sum is " + sum(param1, param2));

    }
}
