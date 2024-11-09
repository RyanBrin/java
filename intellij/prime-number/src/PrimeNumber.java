/*
 * Ryan Brinkman
 * Prime Number
 * Page 150
 * 9/30/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        // Declare variables
        boolean prime = true;
        int number;

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        // Check if number is prime
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                prime = false;
                break;

            }
        }

        // Display result
        if (prime)
        {
            System.out.println(number + " is a prime number.");

        }
        else
        {
            System.out.println(number + " is not a prime number.");

        }

        scanner.close(); // Close scanner object

    }
}