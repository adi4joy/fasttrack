package ro.fasttrackit.curs8.Homework.ex2;

public class MainBank {
    public static void main(String[] args) {
        Bank ing = new bankING();
        Bank bt = new bankBT();
        Bank brd = new bankBRD();

        new Client(ing).moneyDeposit();
        new Client(ing).moneyWithdraw();
    }
}
