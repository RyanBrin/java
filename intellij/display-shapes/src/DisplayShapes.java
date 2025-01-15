/**
 * Project: Display Shapes
 * Author: Ryan Brinkman
 * Date: 1/14/2025
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/display-shapes/
 */

import java.util.Scanner;

public class DisplayShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Display Shapes");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Triangle");
            System.out.println("5. Heart");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> circle();
                case 2 -> square();
                case 3 -> rectangle();
                case 4 -> triangle();
                case 5 -> heart();
                case 6 -> {
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void circle() {
        System.out.println("  ***** ");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("  *****  ");
        System.out.println();
    }

    public static void square() {
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println();
    }

    public static void rectangle() {
        System.out.println("**************");
        System.out.println("**************");
        System.out.println("**************");
        System.out.println();
    }

    public static void triangle() {
        System.out.println("     *     ");
        System.out.println("    ***    ");
        System.out.println("   *****   ");
        System.out.println("  *******  ");
        System.out.println(" ********* ");
        System.out.println("***********");
        System.out.println();
    }

    public static void heart() {
        System.out.println("   **  **  ");
        System.out.println(" **********");
        System.out.println(" **********");
        System.out.println("   ******  ");
        System.out.println("     **    ");
        System.out.println();
    }
}