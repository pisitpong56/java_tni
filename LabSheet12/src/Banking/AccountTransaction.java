package Banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount implements Transactionable{
    public AccountTransaction(String account_Id) {
        super(account_Id);
    }

    public boolean hasAccountId() throws FileNotFoundException {
        File filename = new File("src/Banking/users_account.txt");
        Scanner scanner = new Scanner(filename);

        if (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(",");
            scanner.close();
            return this.getAccount_Id().equals(data[0]);
        }
        scanner.close();
        return false;
    }

    @Override
    public void deposit(double amount) {
        this.setAccount_Balance(amount);
    }

    @Override
    public void withdraw(double amount) {
        this.setAccount_Balance(this.getAccount_Balance() - amount);
    }

    @Override
    public double checkBalance() {
        return this.getAccount_Balance();
    }
}
