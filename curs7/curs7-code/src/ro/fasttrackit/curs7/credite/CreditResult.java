package ro.fasttrackit.curs7.credite;

public class CreditResult {
    private String fullName;
    private boolean approved;

    public CreditResult(String fullName) {
        this.fullName = fullName;
        this.approved = false;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String toString() {
        return fullName + " " + approved;
    }
}
