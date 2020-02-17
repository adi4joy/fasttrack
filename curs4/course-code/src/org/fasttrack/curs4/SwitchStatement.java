package org.fasttrack.curs4;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println(returnMonth(3));

        goodColors("red");

        String calif = grades(10);
        System.out.println(calif);
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
                result = "I got bored";
                break;
        }

        return result;
    }

    public static void goodColors(String color) {
        switch (color) {
            case "red":
            case "blue":
            case "yellow":
                System.out.println("Good");
                break;
            case "pink":
                System.out.println("Bad");

        }
    }

    public static String grades(int note) {
        String calificativ;

        switch (note) {
            case 1:
            case 2:
            case 3:
            case 4:
                calificativ = "I";
                break;
            case 5:
            case 6:
                calificativ = "S";
                break;
            case 7:
            case 8:
                calificativ = "B";
                break;
            case 9:
            case 10:
                calificativ = "FB";
                break;
            default:
                calificativ = "Nu exista nota";
        }
        return calificativ;
    }
}
