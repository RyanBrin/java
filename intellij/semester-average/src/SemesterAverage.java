/*
 * Project: Semester Average
 * Author: Ryan Brinkman
 * Date: April 2, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/semester-average/
 */

import javax.swing.*;
import java.awt.*;

public class SemesterAverage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Semester Average");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel instructionLabel = new JLabel("Enter grades below:");
        instructionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(instructionLabel);

        JTextField[] gradeFields = new JTextField[5];
        for (int i = 0; i < gradeFields.length; i++) {
            gradeFields[i] = new JTextField(10);
            gradeFields[i].setMaximumSize(new Dimension(200, 30));
            panel.add(gradeFields[i]);
        }

        JButton calculateButton = new JButton("Calculate Average");
        calculateButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(calculateButton);

        JLabel resultLabel = new JLabel("");
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(resultLabel);

        calculateButton.addActionListener(e -> {
            try {
                double total = 0;
                for (JTextField field : gradeFields) {
                    total += Double.parseDouble(field.getText());
                }
                double average = total / gradeFields.length;
                resultLabel.setText("Semester Average: " + String.format("%.2f", average));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numeric grades.");
            }
        });

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
