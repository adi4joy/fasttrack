package ro.fasttrackit.curs6.Homework;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primul numar este: ");
        int input1 = scanner.nextInt();
        System.out.print("Al doilea numar este: ");
        int input2 = scanner.nextInt();
        System.out.println("Suma lor este:  " + numbers(input1, input2));
    }

    public static int numbers(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

}
