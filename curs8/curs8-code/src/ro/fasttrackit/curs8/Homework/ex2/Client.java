package ro.fasttrackit.curs8.Homework.ex2;

public class Client {
    private Bank bank;

    public Client(Bank bank) {
        this.bank = bank;
    }

    public void moneyWithdraw() {
        this.bank.bankServices(15000);
        System.out.println("Your credit application is pending.");
    }

    public void moneyDeposit() {
        this.bank.bankDeposit(1000);
        System.out.println("You added money to your account.");
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }
}
