/**
 * Represents a circle defined by a radius.
 */
public class Circle {
    private double radius;
    private static final double PI = Math.PI;

    /**
     * Default constructor that initializes the radius to 1.
     */
    public Circle() {
        this.radius = 1;
    }

    /**
     * Constructor that initializes the radius to the specified value.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius The new radius value.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle.
     *
     * @return The radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return The area of the circle.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Calculates and returns the circumference of the circle.
     *
     * @return The circumference of the circle.
     */
    public double getCircumference() {
        return 2 * PI * radius;
    }

    /**
     * Returns a string representation of the circle, including its radius.
     *
     * @return A string representation of the circle.
     */
    @Override
    public String toString() {
        return "The circle has a radius of " + radius;
    }
}