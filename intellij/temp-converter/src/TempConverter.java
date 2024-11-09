/*
 * Ryan Brinkman
 * Temp Converter
 * Page None
 * 10/21/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                fahrenheit();
                break;
            case 2:
                celsius();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }
    public static void fahrenheit () {

        double fTemp;
        double cTemp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        fTemp = scanner.nextDouble();

        cTemp = (double) 5 / (double) 9 * (fTemp - 32);
        System.out.printf("Temperature in Celsius: %.2f%n", cTemp);

        scanner.close();
    }
    public static void celsius () {

        double fTemp;
        double cTemp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celcius: ");
        cTemp = scanner.nextDouble();

        fTemp = (double) 9 / (double) 5 * cTemp + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fTemp);

        scanner.close();
    }
}
