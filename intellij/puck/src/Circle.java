/**
 * Circle Class
 */
public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    /**
     * Default constructor method to initialize radius
     */
    public Circle() {
        radius = 1;
    }

    /**
     * Constructor method to initialize radius to specified value
     */
    public Circle(double r) {
        radius = r;
    }

    /**
     * Setter or modifier method
     *
     * @param newRadius A new radius value is provided
     */
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    /**
     * Getter method or accessor method
     * @return The area of the circle
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Getter method or accessor method
     * @return The radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Getter method of accessor method
     * @return The circumference of the circle
     */
    public double getCircumference() {
        return 2 * PI * radius;
    }

    /**
     * Getter method
     * @return The radius of the circle as a String
     */
    public String toString() {
        String circleString = ("The circle has a radius of " + radius);
        return circleString;
    }
}