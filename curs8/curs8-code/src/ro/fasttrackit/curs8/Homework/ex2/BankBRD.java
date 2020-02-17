package ro.fasttrackit.curs8.Homework.ex2;

public class BankBRD implements Bank {
    public void bankServices(int credit) {
        System.out.println("We received your application for a credit of " + credit + " EUR");
    }

    public void bankDeposit(int debit) {
        System.out.println("We received your deposit of " + debit + " EUR");
    }
}
