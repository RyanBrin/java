/**
 * Project: Password Manager
 * Author: Ryan Brinkman
 * Date: 12/18/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/password-manager/
 */

import java.util.Scanner;

/**
 * PasswordManager Class
 * Serves as the main entry point for the Password Manager application.
 * This command-line application allows users to manage accounts and their corresponding service passwords.
 */
public class PasswordManager {

    /**
     * The main method initializes the Password Manager application and handles user interactions.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Initialize a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the PasswordManagerApp, passing the Scanner as a parameter
        PasswordManagerApp app = new PasswordManagerApp(scanner);

        /**
         * The Scanner object is passed to the PasswordManagerApp instance, enabling consistent input handling.
         * The PasswordManagerApp will use this Scanner instance to read user input throughout the application.
         */

        // Main loop to display the main menu and process user choices
        while (true) {
            app.displayMainMenu(); // Display the main menu options to the user
            int choice = app.getChoice(); // Get the user's choice from the menu

            // Handle the user's choice with a switch statement
            switch (choice) {
                case 1 -> app.createAccount();
                case 2 -> app.logIn();
                case 3 -> app.exitProgram();
                default -> System.out.println("Invalid choice. Please try again."); // Handle invalid input
            }
        }
    }
}
