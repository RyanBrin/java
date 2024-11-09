/*
 * Ryan Brinkman
 * Necklace
 * Page 153
 * 10/3/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Necklace
{
    public static void main(String[] args)
    {
        // Declare variables
        int num1;
        int num2;
        int x;
        int y;
        int sum;
        int steps = 0;

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter the first starting number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second starting number: ");
        num2 = scanner.nextInt();

        scanner.close(); // Close the scanner

        // Initial x and y values
        x = num1;
        y = num2;

        // Print the starting numbers
        System.out.print(x + " " + y + " ");

        // Print the sequence until the starting numbers are reached again
        do
        {
            sum = x + y;
            x = y;
            y = sum % 10;

            steps++; // Increment the step counter

            System.out.print(y + " "); // Print the sequence

        }
        while (x != num1 || y != num2);

        System.out.println();

        // Display # number of steps taken to close the necklace
        System.out.println("It took " + steps + " steps to close the necklace!");

    }
}