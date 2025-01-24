/*
 * Project: Pyramid
 * Author: Ryan Brinkman
 * Date: January 23, 2025
 *
 * Description:
 * A simple program that allows users to create pyramid objects with specified values
 * and interact with them using various methods.
 *
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/pyramid/
 */

public class PyramidApp {
    public static void main(String[] args) {
        Pyramid Egypt0 = new Pyramid();          // Default pyramid
        Pyramid Egypt1 = new Pyramid(16, 15, 17); // Pyramid with custom dimensions
        Pyramid Egypt2 = new Pyramid(66, 56, 65); // Another custom pyramid

        Egypt0.printPyramidDetails();
        System.out.println();
        Egypt1.printPyramidDetails();
        System.out.println();
        Egypt2.printPyramidDetails();
    }
}