/*
 * Ryan Brinkman
 * Quadratic Formula
 * Page 126
 * 9/12/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class QuadraticFormula
{
    public static void main(String[] args)
    {
        // Declare variables
        double a;
        double b;
        double c;
        double d;
        double root1;
        double root2;

        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Obtain user input
        System.out.println("Enter value for a: ");
        a = scanner.nextDouble();

        System.out.println("Enter value for b: ");
        b = scanner.nextDouble();

        System.out.println("Enter value for c: ");
        c = scanner.nextDouble();

        scanner.close(); // Close scanner

        // Calculate
        d = b * b - 4 * a * c;

        root1 = (-b + Math.sqrt(d)) / (2 * a);
        root2 = (-b - Math.sqrt(d)) / (2 * a);

        // Check discriminator and display results
        if (d >= 0)
        {
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);

        }
        else
        {
            System.out.println("The equation has imaginary roots.");

        }
    }
}
