/*
 * Ryan Brinkman
 * Dice Rolls
 * Page 154
 * 10/9/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class DiceRolls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter the number of dice rolls: ");
        int rolls = scanner.nextInt();

        scanner.close(); // Close the scanner

        // Initialize sum
        int sum = 0;

        System.out.println("Roll #\t Dice1\t Dice2\t Total");

        // Roll dice and calculate sum
        for (int i = 1; i <= rolls; i++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;

            sum = dice1 + dice2;

            // Display the result
            System.out.printf("\t" + i + "\t\t" + dice1 + "\t\t" + dice2 + "\t\t" + sum + "\n");

        }
    }
}
