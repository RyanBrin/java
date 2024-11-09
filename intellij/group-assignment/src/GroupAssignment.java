/*
 * Ryan Brinkman
 * Group Assignment
 * Page 156
 * 10/16/2024
 */

// Import necessary libraries
import java.util.Scanner;
import java.util.Arrays;

public class GroupAssignment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user information
        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter the third name: ");
        String name3 = scanner.nextLine();

        scanner.close(); // Close scanner

        String[] names = {name1, name2, name3}; // Create array of names

        // Sort names in alphabetical order
        Arrays.sort(names);

        // Display results
        System.out.println("Sorted names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
