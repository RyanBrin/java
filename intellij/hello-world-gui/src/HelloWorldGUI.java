/*
 * Project: Hello World GUI
 * Author: Ryan Brinkman
 * Date: March 31, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/hello-world-gui/
 */

import javax.swing.*;

public class HelloWorldGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, World!");

        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Hello, World!");

        label.setBounds(10, 10, 280, 40);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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