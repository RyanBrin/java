/*
 * Project: Student Roster
 * Author: Ryan Brinkman
 * Date: 12/04/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/student-roster/
 */

// Import necessary libraries
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] count = new int[10];
        int[] count2 = new int[] {
                1, 2, 3, 4, 5
        };

        // Declare and initialize an array of integers
        String[] stringArray = new String[7];
        String[] stringArray2 = new String[] {
                "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"
        };

        // Declare necessary variables
        int size;

        // Create a Scanner object to read input from the user
        Scanner intScanner = new Scanner(System.in);
        Scanner listScanner = new Scanner(System.in);

        // Obtain the number of students from the user
        System.out.print("Enter the number of students: ");
        size = intScanner.nextInt();

        intScanner.close(); // Close the scanner

        // Create a student array with the given size
        String[] students = new String[size];

        // Obtain names from the array of students
        for (int i = 0; i < students.length; i++)
            students[i] = listScanner.nextLine();

        listScanner.close(); // Close the scanner

        // Display the student names
        System.out.println("Student List:");
        for (String student : students)
            System.out.println(student);
    }
}