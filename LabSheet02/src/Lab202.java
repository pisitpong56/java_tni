import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int x = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int y = scanner.nextInt();

        System.out.print("");
        System.out.print("");
        System.out.println("Summation = " + (x + y));
        System.out.println("Subtraction = " + (x - y));
        System.out.println("Multiplication = " + (x * y));
        System.out.println("Division = " + (float)x / y);
        System.out.println("Modulus = " + (x % y));
    }
}
