import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = sc.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = sc.next();
        System.out.print("How many pounds: ");
        double pound = sc.nextDouble();
        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);
        System.out.println(order1);


        System.out.println();


        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor: ");
        String cupcake_flavor = sc.next();
        System.out.print("How many piece: ");
        int piece = sc.nextInt();
        CupCake order2 = new CupCake(piece, cupcake_flavor, 65);
        System.out.println(order2);


        System.out.println();


        System.out.println("Brownie Details:");
        System.out.print("Enter a flavor: ");
        String brownie_flavor = sc.next();
        System.out.print("How many piece: ");
        int brownie_piece = sc.nextInt();
        Brownie order3 = new Brownie(brownie_piece, brownie_flavor, 100);
        System.out.print("Do you want to add Topping? (Press 1 to add / Press 2 to skip) ");
        int choose = sc.nextInt();

        if (choose == 1) {
            System.out.print("Enter your topping: ");
            String topping = sc.next();
            order3.addTopping(topping);
        }

        System.out.println();

        System.out.println(order3);

        System.out.println();

        System.out.println("Total price = " + ((order1.getUnitPrice() * pound) +
                (order2.getUnitPrice() * piece) + order3.calculateTotalPrice()));
    }
}
