package org.fasttrack.curs4.CourseAsCode;

import java.util.Scanner;

public class FControlStatementWhile {
    public static void main(String[] args) {
        System.out.println("Control Statement : WHILE");
        Scanner valueReader = new Scanner(System.in);
        System.out.print("Insert max number to loop to: (Note if you input 0, the loop won't be invoked at all): ");
        int max = valueReader.nextInt();
        int index = 0;
        while (index < max) {
            System.out.println("Looping while " + index);
            index = index + 1;
        }
    }
}
