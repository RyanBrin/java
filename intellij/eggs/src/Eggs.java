/*
 * Ryan Brinkman
 * Eggs
 * Page 122
 * 9/10/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args)
    {
        // Declare variables
        int eggs;
        double eggsCost;
        int dozens;

        Scanner slave = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter the number of eggs purchased: ");
        eggs = slave.nextInt();

        slave.close(); // Close the scanner

        // Calculate dozens and individual eggs
        dozens = eggs / 12;
        eggs = eggs % 12;

        // Calculate eggs cost
        if (dozens < 4)
        {
            eggsCost = dozens * .5;
            eggsCost += (eggs * .5) / 12;

        }
        else if (dozens < 6)
        {
            eggsCost = dozens * .45;
            eggsCost += (eggs * .45) / 12;

        }
        else if (dozens < 11)
        {
            eggsCost = dozens * .4;
            eggsCost += (eggs * .4) / 12;

        }
        else
        {
            eggsCost = dozens * .35;
            eggsCost += (eggs * .35) / 12;

        }

        // Display results
        System.out.printf("The bill is equal to: $%.2f", eggsCost);

    }
}
