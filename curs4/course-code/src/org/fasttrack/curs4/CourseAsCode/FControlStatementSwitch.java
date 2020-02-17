package org.fasttrack.curs4.CourseAsCode;

import java.util.Scanner;

public class FControlStatementSwitch {
    public static void main(String[] args) {
        System.out.println("Control Statement : SWITCH");
        Scanner valueReader = new Scanner(System.in);
        System.out.print("Input value:");
        int a = valueReader.nextInt();
        switch (a) {
            case 1:
                System.out.println("The first input");
                break;
            case 2:
                System.out.println("The second input");
                break;
            case 3:
                System.out.println("The third input");
                break;
            case 4:
                System.out.println("The fourth input");
                break;
            default:
                System.out.println("Default input");
        }
    }
}
