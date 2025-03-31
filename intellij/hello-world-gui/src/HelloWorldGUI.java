/*
 * Project: Hello World GUI
 * Author: Ryan Brinkman
 * Date: March 31, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/hello-world-gui/
 */

import javax.swing.*;

public class HelloWorldGUI {
    public static void main(String[] args) {
        // Create a new JFrame with a title
        JFrame frame = new JFrame("Hello, World!");

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the layout to null to allow custom layout
        frame.setLayout(null);

        // Create a new JLabel with the text "Hello, World!"
        JLabel label = new JLabel("Hello, World!");

        // Set the position and size of the label
        label.setBounds(10, 10, 280, 40);

        // Add the label to the frame
        frame.add(label);

        // Set the default close operation to EXIT_ON_CLOSE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);

        JButton hideButton = new JButton("Hide");

        hideButton.setBounds(10, 60, 100, 40);

        frame.add(hideButton);

        hideButton.addActionListener(e -> {
            label.setVisible(false);
        });

        JButton showButton = new JButton("Show");

        showButton.setBounds(120, 60, 100, 40);

        frame.add(showButton);

        showButton.addActionListener(e -> {
            label.setVisible(true);
        });
    }
}