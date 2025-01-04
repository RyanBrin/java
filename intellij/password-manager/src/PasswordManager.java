/*
 * Project: Password Manager
 * Author: Ryan Brinkman
 * Date: 12/18/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/password-manager/
 */

import java.util.Scanner;

/**
 * A simple command-line password manager for managing accounts and service passwords.
 */
public class PasswordManager {

    /**
     * The main entry point for the Password Manager application.
     * Initializes the application and displays the main menu.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner object
        PasswordManagerApp app = new PasswordManagerApp(scanner); // Create password manager object

        // Main loop for displaying the main menu and handling user choices.
        while (true) {
            app.displayMainMenu(); // Call display main menu function within the Password Manager application class.
            int choice = app.getChoice();

            // Switch statement to handle user choices and perform the corresponding actions.
            switch (choice) {
                case 1 -> app.createAccount();
                case 2 -> app.logIn();
                case 3 -> app.exitProgram();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}