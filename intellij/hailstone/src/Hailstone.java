/*
 * Ryan Brinkman
 * Hailstone
 * Page 154
 * 10/10/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        scanner.close(); // Close the scanner

        System.out.println("Hailstone sequence:");

        while (num != 1) {
            if (num % 2 == 0)
                num /= 2;
            else
                num = 3 * num + 1;

            System.out.print(num + " ");
        }
    }
}
