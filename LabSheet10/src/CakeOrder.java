import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birthday Cake's Details");
        System.out.print("Enter a message on cake: ");
        String message = sc.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = sc.next();
        System.out.print("How many pounds: ");
        double pound = sc.nextDouble();
        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);
        System.out.println(order1);

// ====================================================================================================
        System.out.println();
// ====================================================================================================

        System.out.println("Cup Cake's Details");
        System.out.print("Enter a flavor: ");
        String cupcakeFlavor = sc.next();
        System.out.print("How many pieces: ");
        int cupcakePiece = sc.nextInt();
        CupCake order2 = new CupCake(cupcakePiece, cupcakeFlavor, 65);
        System.out.println(order2);

// ====================================================================================================
        System.out.println();
// ====================================================================================================

        System.out.println("Brownie's Details");
        System.out.print("Enter a flavor: ");
        String brownieFlavor = sc.next();
        System.out.print("How many pieces: ");
        int browniePiece = sc.nextInt();
        System.out.print("""
                Would you like fudgy brownies?
                
                Press 1 to confirm
                
                Press 2 to skip
                
                Select an option:\s""");
        int choice = sc.nextInt();
        Brownie order3 = new Brownie(browniePiece, brownieFlavor, 100);

        if (choice == 1) {
            order3.isFudgy();
        }
        System.out.println(order3);

// ====================================================================================================
        System.out.println();
// ====================================================================================================

        double totalPrice = order1.calculateTotalPrice() +
                order2.calculateTotalPrice() +
                order3.calculateTotalPrice();
        System.out.println("Total price = " + totalPrice);
    }
}
