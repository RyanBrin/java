/*
 * Ryan Brinkman
 * Trig Functions
 * Page 128
 * 9/17/2024
 */

// Import necessary libraries
import java.util.Scanner;
import java.lang.Math;

public class TrigFunctions
{
    public static void main(String[] args)
    {
        // Declare variables
        int degrees = 0;
        double sin = 0;
        double cos = 0;
        double tan = 0;

        // Generate random number
        Scanner scanner = new Scanner(System.in);

        // Obtain user input
        System.out.print("Enter an angle in degrees: ");
        degrees = scanner.nextInt();

        scanner.close(); // Close the scanner

        // Calculate
        sin = Math.sin(Math.toRadians(degrees));
        cos = Math.cos(Math.toRadians(degrees));
        tan = Math.tan(Math.toRadians(degrees));

        // Display results
        System.out.println("Sine: " + sin);
        System.out.println("Cosine: " + cos);
        System.out.println("Tangent: " + tan);

    }
}
