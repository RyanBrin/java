/*
 * Project: Roll Dice
 * Author: Ryan Brinkman
 * Date: April 1, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/roll-dice/
 */

import javax.swing.*;
import java.awt.*;

public class RollDice {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Roll Dice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Label to display die face
        JLabel dieFace = new JLabel(new ImageIcon("die1.gif"));
        dieFace.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(dieFace);
        dieFace.setIcon(new ImageIcon("src/assets/die1.gif"));


        // Create the roll dice button
        JButton rollDiceButton = new JButton("Roll Dice");
        rollDiceButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        rollDiceButton.addActionListener(e -> {
            // Roll a random number between 1 and 6
            int roll = (int) (Math.random() * 6) + 1;
            // Update the die face image based on the roll
            dieFace.setIcon(new ImageIcon("src/assets/die" + roll + ".gif"));
        });
        panel.add(rollDiceButton);

        // Add the panel to the frame and make it visible
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}