/*
 * Project: Puck
 * Author: Ryan Brinkman
 * Date: 11/20/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/puck/
 */

public class TestPuck {
    public static void main(String[] args) {
        // Create four pucks with different radii, thicknesses, and weights
        Puck blue = new Puck(5.2, 1, 1.5);
        Puck red = new Puck(4.5, 1, 1.5);
        Puck green = new Puck(4.0, 2, 1.5);
        Puck yellow = new Puck(5.0, 1, 1.5);

        Puck pucks[] = new Puck[] {blue, red, green, yellow};

        // Print radius of each puck
        System.out.println("Blue Puck Radius: " + blue.getRadius());
        System.out.println("Red Puck Radius: " + red.getRadius());
        System.out.println("Green Puck Radius: " + green.getRadius());
        System.out.println("Yellow Puck Radius: " + yellow.getRadius());

        System.out.println();

        // Print thickness of each puck
        System.out.println("Blue Puck Thickness: " + blue.getThickness());
        System.out.println("Red Puck Thickness: " + red.getThickness());
        System.out.println("Green Puck Thickness: " + green.getThickness());
        System.out.println("Yellow Puck Thickness: " + yellow.getThickness());

        System.out.println();

        // Print weight of each puck
        System.out.println("Blue Puck Weight: " + blue.getWeight());
        System.out.println("Red Puck Weight: " + red.getWeight());
        System.out.println("Green Puck Weight: " + green.getWeight());
        System.out.println("Yellow Puck Weight: " + yellow.getWeight());

        System.out.println();

        // Compare pucks to Blue Puck and figure out what type of puck it is
        for (int i = 0; i < pucks.length; i++) {
            if (pucks[i].getWeight() == blue.getWeight()) {
                if (i == 0) {
                    System.out.println("Blue Puck is equal to Blue Puck.");
                } else if (i == 1) {
                    System.out.println("Red Puck is equal to Blue Puck.");
                } else if (i == 2) {
                    System.out.println("Green Puck is equal to Blue Puck.");
                } else {
                    System.out.println("Yellow Puck is equal to Blue Puck.");
                }
            } else {
                if (i == 0) {
                    System.out.println("Blue Puck is not equal to Blue Puck.");
                } else if (i == 1) {
                    System.out.println("Red Puck is not equal to Blue Puck.");
                } else if (i == 2) {
                    System.out.println("Green Puck is not equal to Blue Puck.");
                } else {
                    System.out.println("Yellow Puck is not equal to Blue Puck.");
                }
            }

            if (pucks[i].getWeight() > 5) {
                if (i == 0) {
                    System.out.println("Blue Puck is a training Puck.");
                } else if (i == 1) {
                    System.out.println("Red Puck is a training Puck.");
                } else if (i == 2) {
                    System.out.println("Green Puck is a training Puck.");
                } else {
                    System.out.println("Yellow Puck is a training Puck.");
                }
            } else if (pucks[i].getWeight() >= 4.5) {
                if (i == 0) {
                    System.out.println("Blue Puck is a normal regulation Puck.");
                } else if (i == 1) {
                    System.out.println("Red Puck is a normal regulation Puck.");
                } else if (i == 2) {
                    System.out.println("Green Puck is a normal regulation Puck.");
                } else {
                    System.out.println("Yellow Puck is a normal regulation Puck.");
                }
            } else {
                if (i == 0) {
                    System.out.println("Blue Puck is a lighter Puck.");
                } else if (i == 1) {
                    System.out.println("Red Puck is a lighter Puck.");
                } else if (i == 2) {
                    System.out.println("Green Puck is a lighter Puck.");
                } else {
                    System.out.println("Yellow Puck is a lighter Puck.");
                }
            }

            System.out.println();
        }
    }
}