import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {
        String code = "PD-001";
        String name = "Pencil Box";
        int item = 112;
        double price_per_item = 30.20;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.println("Product name: " + name + " (" + code + ")");
        System.out.println("Product item: " + item + " (" + price_per_item + "bath/piece)");

        double total_price = item * price_per_item;
        System.out.println("Total price: " + frm.format(total_price) + "baht");
    }
}
