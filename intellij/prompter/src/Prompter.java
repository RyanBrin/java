/*
 * Ryan Brinkman
 * Prompter
 * Page 133
 * 9/24/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Prompter
{
    public static void main(String[] args)
    {
        // Declare variables
        int low;
        int high;
        int num;

        Scanner scanner = new Scanner(System.in); // Create scanner

        // Obtain information from user
        System.out.print("Enter the low number: ");
        low = scanner.nextInt();

        System.out.print("Enter the high number: ");
        high = scanner.nextInt();

        do
        {
            System.out.print("Enter a number between " + low + " and " + high + ": ");
            num = scanner.nextInt();

        }
        while (num < low || num > high);

        scanner.close(); // Close the scanner

        // Display result
        System.out.println();
        System.out.println(num + " is between " + low + " and " + high + "!");

    }
}