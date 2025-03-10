import java.util.Scanner;
import java.lang.Math;

/*
 * Test Circle Objects class
 */
public class TestCircleObjects {
    public static void displayARray(Circle[] array) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numObjects;
        Circle[] test;

        System.out.print("Enter the number of Circle objects to create: ");
        numObjects = scanner.nextInt();

        test = new Circle[numObjects];

        for (int i = 0; i < numObjects; i++) {
            test[i] = new Circle((int)(101 * Math.random()));
        }
    }
}
