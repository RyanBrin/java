/*
 * Project: Latin Plant Names
 * Author: Ryan Brinkman
 * Date: April 1, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/latin-plant-names/
 */

import javax.swing.*;

public class LatinPlantNames {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Latin Plant Names");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setTitle("Latin Plant Names");

        JPanel pane = new JPanel();
        pane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel plantListPrompt = new JLabel("Select a plant name: ");
        JLabel selectedPlant = new JLabel();

        JComboBox<String> plantComboBox = getStringJComboBox(selectedPlant);

        pane.add(plantListPrompt);
        pane.add(plantComboBox);
        pane.add(selectedPlant);

        frame.add(pane);
        frame.setVisible(true);
    }

    private static JComboBox<String> getStringJComboBox(JLabel selectedPlant) {
        String[] plantNames = {
                "Basil",
                "Parsley",
                "Lavender",
                "Peppermint",
                "Saffron",
                "Sage"
        };
        String[] latinNames = {
                "Ocimum basilicum",
                "Petroselinum crispum",
                "Lavandula",
                "Mentha × piperita",
                "Crocus sativus",
                "Salvia officinalis"
        };
        JComboBox<String> plantComboBox = new JComboBox<>(plantNames);

        // Simplified ActionListener using a lambda expression
        plantComboBox.addActionListener(e -> {
            int selectedIndex = plantComboBox.getSelectedIndex();
            selectedPlant.setText("You selected: " + plantNames[selectedIndex] + " (" + latinNames[selectedIndex] + ")");
        });
        return plantComboBox;
    }
}