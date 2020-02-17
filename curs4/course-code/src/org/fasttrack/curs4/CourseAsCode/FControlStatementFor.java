package org.fasttrack.curs4.CourseAsCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FControlStatementFor {
    public static void main(String[] args) {
        System.out.println("Control Statement : FOR");
        Scanner valueReader = new Scanner(System.in);
        System.out.print("Insert max number to loop to: ");
        int max = valueReader.nextInt();

        for (int i = 0; i < max; i++) {
            System.out.println("For loop " + i);
        }

        List<String> strings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");
        strings.add("fifth");

        for (String element : strings) {
            System.out.println(element);
        }
    }
}
