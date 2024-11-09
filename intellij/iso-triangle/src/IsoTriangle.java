/*
 * Ryan Brinkman
 * Iso Triangle
 * Page 176
 * 10/29/2024
 */

import java.util.Scanner;

public class IsoTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            drawBar(2 * i - 1);
            System.out.println();
        }
    }

    public static void printSpaces(int count) {
        for (int j = 1; j <= count; j++) {
            System.out.print(" ");
        }
    }

    public static void drawBar(int count) {
        for (int k = 1; k <= count; k++) {
            System.out.print("*");
        }
    }
}
