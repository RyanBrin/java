/*
 * Ryan Brinkman
 * Number Sum
 * Page 134
 * 9/24/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class NumberSum
{
    public static void main(String[] args)
    {
        // Declare variables
        int num;
        int counter = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in); // Create scanner

        // Obtain user input
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        scanner.close(); // Close scanner

        // Calculate
        while (counter <= num)
        {
            sum += counter;
            counter++;

        }

        // Display result
        System.out.println("The sum of numbers from 1 to " + num + " is: " + sum);

    }
}