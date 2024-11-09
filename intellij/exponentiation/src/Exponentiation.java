/*
 * Ryan Brinkman
 * Exponentiation
 * Page None
 * 10/25/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Enter an exponent: ");
        int exp = scanner.nextInt();

        scanner.close();

        double result = powerOf(num, exp);

        System.out.println(result);
    }

    public static double powerOf(double num, double exp) {
        if (exp == 0) {
            return 1;
        }
        else if (exp < 0) {
            return 1 / powerOf(num, -exp);
        }
        else {
            return num * powerOf(num, exp - 1);
        }
    }
}