package org.fasttrack.curs4.homework;

import java.util.Scanner;

public class HomeworkExercise3To5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write your name: ");
        String name = scanner.next();
        System.out.print("Please write your height in meters (e.g. 1.8): ");
        double height = scanner.nextDouble();
        System.out.print("Please write your weight in kilograms (e.g. 85.5): ");
        double weight = scanner.nextDouble();
        double result = bmiValue(height, weight);
//        System.out.println("BMI is " + result);
        System.out.println("Dear " + name + ", you have a BMI of " + result);
        if (result < 15) {
            System.out.println("Dear " + name + ", you are very severely underweight");
        } else if (result >= 15 && result <= 16) {
            System.out.println("Dear " + name + ", you are severely underweight");
        } else if (result > 16 && result < 18.5) {
            System.out.println("Dear " + name + ", you are underweight");
        } else if (result >= 18.5 && result < 25) {
            System.out.println("Dear " + name + ", you are within normal weight");
        } else if (result >= 25 && result < 30) {
            System.out.println("Dear " + name + ", you are overweight");
        } else if (result >= 30 && result < 35) {
            System.out.println("Dear " + name + ", you are moderately obese");
        } else if (result >= 35 && result < 40) {
            System.out.println("Dear " + name + ", you are severely obese");
        } else if (result >= 40) {
            System.out.println("Dear " + name + ", you are very severely obese");
        } else {
            System.out.println("You're dead...");
        }
    }

    public static double bmiValue(double height, double weight) {
        return weight / (height * height);
    }
}
