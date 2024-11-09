/*
 * Ryan Brinkman
 * Digits Display
 * Page 151
 * 9/30/2024
 */

// Import necessary libraries
import java.util.Scanner;
import java.lang.String;

public class DigitsDisplay
{
    public static void main(String[] args)
    {
        // Declare variables
        String number;

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter a positive integer: ");
        number = scanner.next();

        scanner.close(); // Close the scanner

        // Display results
        for (int i = 0; i < number.length(); i++)
        {
            System.out.println(number.charAt(i));

        }
    }
}

