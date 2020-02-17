package org.fasttrack.curs4.CourseAsCode;

import java.util.Scanner;

public class FControlStatementDoWhile {
    public static void main(String[] args) {
        System.out.println("Control Statement : DO-WHILE");
        Scanner valueReader = new Scanner(System.in);
        System.out.print("Insert max number to loop to: (Note if you input 0, the loop will be invoked one time): ");
        int max = valueReader.nextInt();
        int index = 0;
        do {
            System.out.println("Looping while " + index);
            index = index + 1;
        } while (index < max);
    }
}
