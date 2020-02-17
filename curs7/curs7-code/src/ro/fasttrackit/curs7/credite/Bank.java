package ro.fasttrackit.curs7.credite;

public class Bank {
    private int creditLimit;

    public Bank(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public CreditResult analyze(Client client) {
        CreditResult result = new CreditResult(client.getFullName());
        if (client.getIncome() * creditLimit >= client.getCredit()) {
            result.setApproved(true);
        } else {
            result.setApproved(false);
        }
        return result;
    }
}
