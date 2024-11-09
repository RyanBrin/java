/*
 * Ryan Brinkman
 * Method Overload
 * Page None
 * 10/24/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class MethodOverload {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character to use: ");
        String userCharacter = scanner.next();

        System.out.print("Enter the length of the bar: ");
        int userLength = scanner.nextInt();

        drawBar(userLength, userCharacter);

        System.out.print("Enter the character to use: ");
        userCharacter = scanner.next();

        System.out.println("Enter a length for the rectangle: ");
        int userLength2 = scanner.nextInt();

        System.out.println("Enter a width for the rectangle: ");
        int userWidth = scanner.nextInt();

        drawBar(userLength2, userCharacter, userWidth);
    }

    public static void drawBar(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawBar(int length, String character) {
        for (int i = 0; i < length; i++) {
            System.out.print(character);
        }
        System.out.println();
    }

    public static void drawBar(int length, String character, int width) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}