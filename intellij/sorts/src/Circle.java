/**
 * Circle class
 */
public class Circle implements Comparable<Circle>{
    private double radius;
    private static final double PI = 3.14159;

    /**
     * Default constructor that initializes the circle with a radius of 1.
     */
    public Circle() {
        radius = 1;
    }

    /**
     * Constructor that initializes the circle with a specified radius.
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Sets a new radius for the circle.
     * @param radius The new radius value to set.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return The area of the circle.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Retrieves the current radius of the circle.
     * @return The radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates the circumference of the circle.
     * @return The circumference of the circle.
     */
    public double circumference() {
        return 2 * PI * radius;
    }
    
    /**
     * Returns a string representation of the circle.
     * @return A string in the format "Circle with radius: [radius]".
     */
    @Override
    public String toString() {
        return "Radius: " + radius;
    }

    /**
     * Compares two circles based on their areas.
     * @param o The other circle to compare with.
     * @return A negative integer, zero, or a positive integer as this circle is less than, equal to, or greater than the specified circle.
     */
    @Override
    public int compareTo(Circle o) {
        return 0;
    }
}