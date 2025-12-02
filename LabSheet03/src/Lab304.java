import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.):"));

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.):"));

        double bmi = weight / Math.pow((height / 100), 2);

        DecimalFormat frm = new DecimalFormat("#,###.00");

        if (bmi < 18.5){
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + frm.format(bmi) + "\nBMI result is Underweight");

        } else if (bmi >= 18.5 || bmi <= 24.9) {
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + frm.format(bmi) + "\nBMI result is Healthly Weight");

        } else if (bmi >= 25 || bmi <= 29.9) {
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + frm.format(bmi) + "\nBMI result is Overweight");

        } else if (bmi >= 30) {
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + frm.format(bmi) + "\nBMI result is Obese");

        }
    }
}
