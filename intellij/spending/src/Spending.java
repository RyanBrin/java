/*
 * Ryan Brinkman
 * Spending
 * Page 102
 * 9/4/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Spending
{
    public static void main(String[] args)
    {
        // Declare variables
        double food;
        double clothing;
        double entertainment;
        double rent;

        Scanner slave = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Food: $");
        food = slave.nextDouble();

        System.out.print("Clothing: $");
        clothing = slave.nextDouble();

        System.out.print("Entertainment: $");
        entertainment = slave.nextDouble();

        System.out.print("Rent: $");
        rent = slave.nextDouble();

        System.out.println();

        slave.close(); // Close scanner

        // Calculate % of budget spent on each category
        double totalSpending = food + clothing + entertainment + rent;
        double foodPercentage = (food / totalSpending) * 100;
        double clothingPercentage = (clothing / totalSpending) * 100;
        double entertainmentPercentage = (entertainment / totalSpending) * 100;
        double rentPercentage = (rent / totalSpending) * 100;

        // Display results
        System.out.print("Category\t\tBudget\n");
        System.out.printf("Food\t\t\t%.2f%%%n", foodPercentage);
        System.out.printf("Clothing\t\t%.2f%%%n", clothingPercentage);
        System.out.printf("Entertainment\t%.2f%%%n", entertainmentPercentage);
        System.out.printf("Rent\t\t\t%.2f%%%n", rentPercentage);

    }
}
