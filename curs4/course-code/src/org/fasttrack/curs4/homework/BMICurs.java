package org.fasttrack.curs4.homework;

import java.util.Scanner;

public class BMICurs {
    public static void main(String[] args) {
        System.out.println(bmi(75, 1.7));
        printBMI();
    }

    public static double bmi(double weight, double height) {
        return weight / (height * height);
    }

    public static void printBMI() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numele: ");
        String nume = scanner.nextLine();
        System.out.print("Introduceti greutatea: ");
        double greutate = scanner.nextDouble();
        System.out.print("Introduceti inaltimea: ");
        double inaltime = scanner.nextDouble();
        double bmi = bmi(greutate, inaltime);

        System.out.println("Draga " + nume + ", ai un BMI de: " + bmi + " si esti in categoria: " + getBmiCategory(bmi));
    }

    public static String getBmiCategory(double bmi) {
        if (bmi < 15) {
            return "Underweight";
        } else if (bmi < 30) {
            return "Normal";
        } else {
            return "Overweight";
        }
    }
}