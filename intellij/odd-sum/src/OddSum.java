/*
 * Ryan Brinkman
 * Odd Sum
 * Page 136
 * 9/26/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class OddSum
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in); // Create scanner

        while (true)
        {
            // Declare variables
            double total = 0;
            int num = 0;

            // Obtain user input
            System.out.print("Enter a number: ");
            num = scanner.nextInt();

            // Calculate sum of odd numbers
            for (int i = 1; i <= num; i += 2)
            {
                total += i;

            }

            // Display results
            System.out.println("Total of the odd numbers is " + total);

        }
    }
}
