package ro.fasttrackit.curs7.credite;

public class Client {
    private String name;
    private String surname;
    private int income;
    private int credit;

    public Client(String name, String surname, int income, int credit) {
        this.name = name;
        this.surname = surname;
        this.income = income;
        this.credit = credit;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getIncome() {
        return income;
    }

    public int getCredit() {
        return credit;
    }

    public String toString() {
        return name + " " + surname + " " + income + " " + credit;

    }
}
