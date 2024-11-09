/*
 * Ryan Brinkman
 * Celsius To Fahrenheit
 * Page None
 * 10/28/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double temp = scanner.nextDouble();

        scanner.close();

        double result = powerOf(temp);

        System.out.printf("The temperature in Fahrenheit is %.2f", result);
    }

    public static double powerOf(double temp) {
        return (double) temp * ((double) 5 / 9) + 32;
    }
}