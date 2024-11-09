/*
 * Ryan Brinkman
 * Percent Passing
 * Page 134
 * 9/25/2024
 */

// Import necessary libraries
import java.util.Scanner;
import java.text.NumberFormat;

public class PercentPassing
{
    public static void main(String[] args)
    {
        // Declare variables
        double score;
        double counter = 0;
        double pass = 0;

        Scanner scanner = new Scanner(System.in); // Create scanner

        NumberFormat percent = NumberFormat.getPercentInstance();

        // Obtain user input
        do
        {
            System.out.print("Enter a score (Enter '0' to quit): ");
            score = scanner.nextInt();

            if (score > 0)
            {
                counter++;

            }

            if (score >= 70)
            {
                pass++;

            }
        }
        while (score > 0);

        scanner.close(); // Close scanner

        // Display result
        System.out.println("The percent of passing scores is: " + percent.format(pass/counter));
    }
}