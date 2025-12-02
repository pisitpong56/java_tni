import javax.swing.*;
import java.text.DecimalFormat;


public class Ex203 {
    public static void main(String[] args) {
        final double LECTURE_PRICE = 1900;
        final double LAB_PRICE = 3500;
        DecimalFormat frm = new DecimalFormat("#,###.00");

        int lecture_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit: "));
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lab credit: "));

        double lecture_total_price = LECTURE_PRICE * lecture_credit;
        double lab_total_price = lab_credit * LAB_PRICE;
        double total = lecture_total_price + lab_total_price;

        JOptionPane.showMessageDialog(null,
                "Lecture: " + lecture_credit + "x" + LECTURE_PRICE + "=" + frm.format(lecture_total_price) +
                "\nLabarotory: " + lab_credit + "x" + LAB_PRICE + "=" + frm.format(lab_total_price) +
                "\nTotal price: " + frm.format(total));
    }
}
