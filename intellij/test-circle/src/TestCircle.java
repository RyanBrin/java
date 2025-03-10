/*
 * Project: Circle
 * Author: Ryan Brinkman
 * Date: October 30, 2024
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/test-circle/
 */

public class TestCircle {
    public static void main(String[] args) {
        Circle spot = new Circle();
        Circle red = new Circle();
        Circle blue = new Circle();
        Circle yellow = new Circle();

        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle radius: " + red.getRadius());
        System.out.println("Circle radius: " + blue.getRadius());
        System.out.println("Circle radius: " + yellow.getRadius());

        spot.setRadius(5);
        red.setRadius(10);
        blue.setRadius(15);
        yellow.setRadius(20);

        System.out.println("Circle area: " + spot.getArea());
        System.out.println("Circle area: " + red.getArea());
        System.out.println("Circle area: " + blue.getArea());
        System.out.println("Circle area: " + yellow.getArea());

        System.out.println("Circle circumference: " + spot.circumference());
        System.out.println("Circle circumference: " + red.circumference());
        System.out.println("Circle circumference: " + blue.circumference());
        System.out.println("Circle circumference: " + yellow.circumference());
    }
}