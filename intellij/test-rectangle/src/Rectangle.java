/**
 * Rectangle Class
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructor Method
     * @pre None
     * @post A Rectangle object is created. Length and Width initialed to 1.0.
     */
    public Rectangle() {
        length = 1;
        width = 1;
    }

    /**
     * Constructor Method
     * @pre None
     * @post A Rectangle object is created. Length and Width are initialized to provided values.
     */
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    /**
     * Getter method
     * @return The length of the rectangle
     * @pre None
     * @post Returns the length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Getter method
     * @return The width of the rectangle
     * @pre None
     * @post Returns the width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Getter method
     * @return The perimeter of the rectangle
     * @pre None
     * @post Returns the perimeter of the rectangle
     */
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    /**
     * Getter method
     * @return The area of the rectangle
     * @pre None
     * @post Returns the area of the rectangle
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Getter method
     * @pre None
     * @post Returns the formula for area
     */
    public static void areaFormula() {
        System.out.println("area = length * width");
    }
}