package org.fasttrack.curs4.CourseCode;

public class FSwitchStatement {
    public static void main(String[] args) {
        System.out.println(returnMonth(3));

        goodColours("pink");

       String calif =  toCalificativ(8);
        System.out.println(calif);
    }

    public static String toCalificativ(int nota) {
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "I";
            case 5:
            case 6:
                return "S";
            case 7:
            case 8:
                return "B";
            case 9:
            case 10:
                return "FB";
            default:
                return "n/a";
        }
    }

    public static void goodColours(String color) {
        switch (color) {
            case "red":
            case "blue":
            case "yellow":
                int a = 2;
                if (a > 10) {
                    System.out.println("a");
                }
                System.out.println("Good");
                break;
            case "pink":
                System.out.println("Bad");
        }
    }

    public static String returnMonth(int month) {
        String result;
        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            default:
                result = "I got bored!";
        }
        return result;
    }
}
