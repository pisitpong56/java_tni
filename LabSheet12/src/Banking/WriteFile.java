package Banking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter filename = new FileWriter("src/Banking/users_account.txt", true);
        PrintWriter writer = new PrintWriter(filename);

        writer.println();

        writer.close();
    }
}