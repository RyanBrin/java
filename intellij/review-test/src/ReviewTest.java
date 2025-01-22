/*
 * Project: Review Test
 * Author: Ryan Brinkman
 * Date: January 22, 2025
 * Description: A simple program that takes the three sides of a triangle and determines the type of triangle.
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/review-test/
 */

import java.util.Scanner;

public class ReviewTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Triangle Classifier");
            System.out.print("""
                    1. Classify triangle
                    2. Exit
                    """);
            System.out.print("Enter your choice (1-2): ");
            int choice = scanner.nextInt();

            scanner.close();

            switch (choice) {
                case 1 -> classifyTriangles();
                case 2 -> System.exit(0);
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Prompts the user to enter the three sides of a triangle and classifies it.
     * Ensures that the entered values form a valid triangle before classification.
     */
    public static void classifyTriangles() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle: ");
        double c = scanner.nextDouble();

        if (!isValidTriangle(a, b, c)) {
            System.out.println("Invalid triangle. The sum of any two sides must be greater than the third side.");
        } else {
            String triangleType = classifyTriangle(a, b, c);
            System.out.printf("The triangle is a %s triangle.%n", triangleType);
        }

        scanner.close();
    }

    /**
     * Determines the type of triangle based on side lengths.
     *
     * @param a the length of the first side of the triangle
     * @param b the length of the second side of the triangle
     * @param c the length of the third side of the triangle
     * @return a String representing the type of triangle: "Equilateral", "Isosceles", or "Scalene"
     */
    private static String classifyTriangle(double a, double b, double c) {
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else
            return "Scalene";
    }

    /**
     * Validates whether the given three sides can form a triangle.
     *
     * @param a the length of the first side of the triangle
     * @param b the length of the second side of the triangle
     * @param c the length of the third side of the triangle
     * @return true if the sides satisfy the triangle inequality theorem, false otherwise
     */
    private static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}