package ro.fasttrackit.curs8.Homework;

public class TestTR8 {
    public static void main(String[] args) {
        System.out.println(inPitagoraRelation(3, 4, 5));
        System.out.println(inPitagoraRelation(5, 12, 13));
        System.out.println(inPitagoraRelation(1, 2, 3));
    }

    public static boolean inPitagoraRelation(int a, int b, int c) {
        int pitagora = a * a + b * b;
        int result = c * c;
        int sum = a + b + c;
        if (pitagora == result && sum%10==0) {
            return true;
        } else {
            return false;
        }
    }
}
