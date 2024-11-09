/**
 * Circle Class
 */
public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    /**
     * Constructor Method
     * @pre None
     * @post A Circle object is created. Radius is initialized to 1
     */
    public Circle() {
        radius = 1;
    }

    public Circle(double r) {
        radius = r;
    }

    /**
     * Setter or modifier method
     * @param newRadius A new radius value is provided
     * @pre A new radius value is sent
     * @post Radius has been changed
     */
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    /**
     * Getter method or accessor method
     * @return The area of the circle
     * @pre None
     * @post Returns the area of the circle
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Getter method or accessor method
     * @return The radius of the circle
     * @pre None
     * @post Returns the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Getter method of accessor method
     * @return The circumference of the circle
     * @pre None
     * @post Returns the circumference of the circle
     */
    public double circumference() {
        return 2 * PI * radius;
    }
}
