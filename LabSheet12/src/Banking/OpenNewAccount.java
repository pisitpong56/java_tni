package Banking;

import java.io.*;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount{
    public OpenNewAccount(String account_Id, double account_Balance) {
        super(account_Id, account_Balance);
    }

    private boolean is_ExistingAccount() throws FileNotFoundException {
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

    public String recordAccount() throws IOException {
        File filename = new File("src/Banking/users_account.txt");
        Scanner scanner = new Scanner(filename);
        PrintWriter writer = new PrintWriter(filename);

        if (is_ExistingAccount()) {
            scanner.close();
            return "This account has been created";
        } else {
            writer.println(this);
            return "Created account success";
        }
    }
}
