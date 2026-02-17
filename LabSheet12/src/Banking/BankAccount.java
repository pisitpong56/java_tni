package Banking;

public class BankAccount {
    private final String account_Id;
    private double account_Balance;

    public BankAccount(String account_Id, double account_Balance) {
        this.account_Id = account_Id;
        this.account_Balance = account_Balance;
    }

    public BankAccount(String account_Id) {
        this.account_Id = account_Id;
        account_Balance = 0;
    }

    public String getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Balance(double account_Balance) {
        this.account_Balance = account_Balance;
    }

    public double getAccount_Balance() {
        return account_Balance;
    }

    public String toString() {
        return account_Id + "," + account_Balance;
    }
}
