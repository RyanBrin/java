import java.util.Scanner;

/**
 * TestPyramid Class
 * A test class for creating and interacting with Pyramid objects.
 * It prompts the user for dimensions, calculates missing values if needed,
 * and displays the pyramid's detail8
 * s.
 */
public class TestPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pyramid Creator");
        System.out.println("(Enter '0' for missing lengths)");

        // Prompt user for input
        System.out.print("Enter the length of the pyramid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the height of the pyramid: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the slant height of the pyramid: ");
        double slantHeight = scanner.nextDouble();

        // Create Pyramid object
        Pyramid pyramid = new Pyramid(length, height, slantHeight);

        // Handle missing values by computing them
        if (length == 0) {
            pyramid.noSideLength();
            System.out.println("Side length was missing. Calculated as: " + pyramid.calculateLength());
        }
        if (height == 0) {
            pyramid.noHeight();
            System.out.println("Height was missing. Calculated as: " + pyramid.calculateHeight());
        }
        if (slantHeight == 0) {
            pyramid.noSlantHeight();
            System.out.println("Slant height was missing. Calculated as: " + pyramid.calculateSlantHeight());
        }

        // Print full pyramid details
        pyramid.printPyramidDetails();
    }
}