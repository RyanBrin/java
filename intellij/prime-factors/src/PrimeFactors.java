/*
 * Ryan Brinkman
 * Prime Factors
 * Page 150
 * 9/30/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String[] args)
    {
        // Declare variables
        int number;
        int factors = 2;

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        // Display header
        System.out.println("Prime factors of " + number + ":");

        // Calculate prime factors and display
        while (number > 1)
        {
            while (number % factors == 0)
            {
                System.out.print(factors + " ");
                number /= factors;

            }

            factors++;

        }

        scanner.close(); // Close scanner

    }
}

