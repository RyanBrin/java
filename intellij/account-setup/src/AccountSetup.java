/*
 * Ryan Brinkman
 * Account Setup
 * Page 139
 * 9/26/2024
 */

// Import necessary libraries
import java.util.Scanner;
import java.lang.String;

public class AccountSetup
{
    public static void main(String[] args)
    {
        // Declare variables
        String username;
        String password;

        Scanner scanner = new Scanner(System.in); // Create scanner

        // Get user input
        System.out.print("Enter a username: ");
        username = scanner.nextLine();

        // Validate password
        do
        {
            System.out.print("Enter a password (must be at least 8 characters long): ");
            password = scanner.nextLine();

            if (password.length() < 8)
            {
                System.out.println("Password must be at least 8 characters long.");

            }
        }
        while (password.length() < 8);

        // Convert to lower case and display results
        username = username.toLowerCase();
        password = password.toLowerCase();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        scanner.close(); // Close scanner

    }
}

