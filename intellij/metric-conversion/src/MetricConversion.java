/*
 * Ryan Brinkman
 * Metric Conversion
 * Page 175
 * 10/28/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Prompt user for input and convert to double
        System.out.print("Enter a number to convert: ");
        double num = scanner.nextDouble();

        System.out.println("Convert:");
        System.out.println(
                """
                1. Inches to Centimeters
                2. Feet to Centimeters
                3. Yards to Meters
                4. Miles to Kilometers
                5. Centimeters to Inches
                6. Centimeters to Feet
                7. Meters to Yards
                8. Kilometers to Miles
                """
        );

        // Choose conversion factor
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0.0;

        // Use switch-case to perform conversion and print result
        switch (choice) {
            case 1:
                result = inchesToCentimeters(num);
                System.out.println(num + " inches equals " + result + " centimeters.");
                break;
            case 2:
                result = feetToCentimeters(num);
                System.out.println(num + " feet equals " + result + " centimeters.");
                break;
            case 3:
                result = yardsToMeters(num);
                System.out.println(num + " yards equals " + result + " meters.");
                break;
            case 4:
                result = milesToKilometers(num);
                System.out.println(num + " miles equals " + result + " kilometers.");
                break;
            case 5:
                result = centimetersToInches(num);
                System.out.println(num + " centimeters equals " + result + " inches.");
                break;
            case 6:
                result = centimetersToFeet(num);
                System.out.println(num + " centimeters equals " + result + " feet.");
                break;
            case 7:
                result = metersToYards(num);
                System.out.println(num + " meters equals " + result + " yards.");
                break;
            case 8:
                result = kilometersToMiles(num);
                System.out.println(num + " kilometers equals " + result + " miles.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        scanner.close(); // Close scanner
    }

    // Conversion functions for each unit conversion
    public static double inchesToCentimeters(double val) {
        return val * 2.54;
    }

    public static double feetToCentimeters(double val) {
        return val * 30.48;
    }

    public static double yardsToMeters(double val) {
        return val * 0.9144;
    }

    public static double milesToKilometers(double val) {
        return val * 1.60934;
    }

    public static double centimetersToInches(double val) {
        return val * 0.393701;
    }

    public static double centimetersToFeet(double val) {
        return val * 0.0328084;
    }

    public static double metersToYards(double val) {
        return val * 1.09361;
    }

    public static double kilometersToMiles(double val) {
        return val * 0.621371;
    }
}