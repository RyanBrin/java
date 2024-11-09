/*
 * Ryan Brinkman
 * Factorial
 * Page 136
 * 9/25/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        // Declare variables
        double factorial = 1;
        int num;

        Scanner scanner = new Scanner(System.in); // Create scanner

        // Obtain user input
        System.out.print("Enter a integer: ");
        num = scanner.nextInt();

        scanner.close(); // Close the scanner

        // Calculate factorial
        for (int i = 1; i <= num; i++)
        {
            factorial *= i;

            // Display the result
            System.out.printf("The factorial of %d is %f%n", i, factorial);
        }
    }
}