/*
 * Ryan Brinkman
 * Random Numbers
 * Page 111
 * 9/10/2024
 */

// Import necessary libraries
import java.util.Scanner;
import java.lang.Math;

public class RandomNumbers
{
    public static void main(String[] args)
    {
        // Declare variables
        int high;
        int low;
        int random;

        Scanner slave = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter the min number: ");
        low = slave.nextInt();

        System.out.print("Enter the max number: ");
        high = slave.nextInt();

        slave.close(); // Close scanner

        // Calculate
        random = (int) (Math.random() * (high - low + 1)) + low;

        // Display results
        System.out.println("Your random number is " + random);

    }
}