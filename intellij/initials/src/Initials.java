/*
 * Ryan Brinkman
 * Initials
 * Page None
 * 10/7/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Initials
{
    public static void main(String[] args)
    {
        // Declare variables
        String name;

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter your full name: ");
        name = scanner.nextLine();

        scanner.close(); // Close the scanner

        // Print initials
        System.out.println(name.charAt(0) + ". " + name.charAt(name.indexOf(' ') + 1) + ". " + name.charAt(name.lastIndexOf(' ') + 1));

    }
}
