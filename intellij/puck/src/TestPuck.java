/*
 * Project: Puck
 * Author: Ryan Brinkman
 * Date: 11/20/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/puck/
 */

public class TestPuck {
    public static void main(String[] args) {
        Puck[] pucks = {
                new Puck(3, 1, 5),
                new Puck(3, 1, 5),
                new Puck(2, 1, 6),
                new Puck(3, 1, 5),
                new Puck(1, 1, 6),
                new Puck(3, 1, 5)
        };

        Puck mainPuck = new Puck(3, 1, 5);

        System.out.println("Main Puck Details:");
        System.out.println("Thickness: " + mainPuck.getThickness());
        System.out.println("Volume: " + mainPuck.getVolume());
        System.out.println("Surface Area: " + mainPuck.getSurfaceArea());
        System.out.println("Weight: " + mainPuck.getWeight());
        System.out.println(mainPuck);
        System.out.println();

        System.out.println("Comparing each puck with the main puck:");
        for (int i = 0; i < pucks.length; i++) {
            Puck currentPuck = pucks[i];
            boolean isEqual = currentPuck.equals(mainPuck);
            System.out.printf("Puck %d: %s\n", i + 1, isEqual ? "Equal to main puck" : "Not equal to main puck");
        }
    }
}
