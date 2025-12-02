import javax.swing.*;
import java.text.DecimalFormat;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,
                "Enter your name: ",
                JOptionPane.QUESTION_MESSAGE);

        DecimalFormat frm = new DecimalFormat("#,###.0");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height(cm.): ",
                JOptionPane.QUESTION_MESSAGE));

        int male_weight = height - 100;
        int female_weight = height -110;

        int gender = JOptionPane.showConfirmDialog(null,
                "Are your biological gender is Male? ",
                "Gender",
                JOptionPane.YES_NO_OPTION);

        if (gender == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Hello, " + name + "\nIf your height is " + height + " cm." + "\nYour weight should be " + frm.format(male_weight) + " kg.",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (gender == JOptionPane.NO_OPTION) {
            int gender1 = JOptionPane.showConfirmDialog(null,
                    "Are your biological gender is Female? ",
                    "Gender",
                    JOptionPane.YES_NO_OPTION);
            if (gender1 == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,
                        "Hello, " + name + "\nIf your height is " + height + " cm." + "\nYour weight should be " + frm.format(female_weight) + " kg.",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (gender1 == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);

            }

        }
    }
}
