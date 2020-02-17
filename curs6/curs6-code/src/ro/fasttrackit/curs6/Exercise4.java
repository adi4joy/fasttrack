package ro.fasttrackit.curs6;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(numbers(7, 12));
    }

    public static int numbers(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }
}
