/*
 * Ryan Brinkman
 * Right Triangle
 * Page None
 * 10/23/2024
 */

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Right Triangle");
        System.out.println("2. Rectangle");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                triangle();
                break;
            case 2:
                rectangle();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        scanner.close();
    }

    public static void triangle() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base length: ");
        int base = scanner.nextInt();

        for (int i = 1; i <= base; i++) {
            drawTriangle(i, base);
        }
        scanner.close();
    }

    public static void drawTriangle(int currentLine, int base) {

        if (currentLine == 1 || currentLine == base) {
            for (int i = 0; i < currentLine; i++) {
                System.out.print("*");
            }
        } else {
            System.out.print("*");
            for (int i = 1; i < currentLine - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }

    public static void rectangle() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = scanner.nextInt();

        System.out.print("Enter the width: ");
        int width = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        scanner.close();
    }
}