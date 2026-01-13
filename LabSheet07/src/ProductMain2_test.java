import java.util.Scanner;

public class ProductMain2_test {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;
        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("""
                Welcome to Mini Shop
                
                ------------------------------
                
                Press [1] to buy Pen
                
                Press [2] to buy Notebook""");

        Scanner scanner = new Scanner(System.in);
        int amount;

        do {
            System.out.print("Enter a number: ");
            amount = scanner.nextInt();

            if (amount == 1) {
                product1.showInfo();
            } else if (amount == 2) {
                product2.showInfo();
            } else {
                System.out.println("Invalid number! Try again.");
            }
        } while (amount != 1 && amount != 2);
    }
}

