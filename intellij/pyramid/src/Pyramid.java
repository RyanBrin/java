/**
 * Pyramid Class
 * This class represents a rectangular pyramid with specified base dimensions,
 * height, and slant height. It includes methods to calculate volume and surface area.
 */
public class Pyramid {
    private double length;
    private double width;
    private double height;
    private double slantHeight;

    /**
     * Default constructor initializes the pyramid with preset dimensions.
     */
    public Pyramid() {
        this.length = 6;
        this.width = 6;
        this.height = 4;
        this.slantHeight = 5;
    }

    /**
     * Parameterized constructor to create a pyramid with custom dimensions.
     *
     * @param length      The base length of the pyramid.
     * @param width       The base width of the pyramid.
     * @param height      The perpendicular height from the base to the apex.
     * @param slantHeight The slant height of the pyramid's triangular faces.
     */
    public Pyramid(double length, double width, double height, double slantHeight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.slantHeight = slantHeight;
    }

    // Getter and Setter methods

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSlantHeight() {
        return slantHeight;
    }

    public void setSlantHeight(double slantHeight) {
        this.slantHeight = slantHeight;
    }

    /**
     * Computes and returns the volume of the pyramid.
     * Formula: (1/3) * base area * height
     *
     * @return The volume of the pyramid.
     */
    public double calculateVolume() {
        return (1.0 / 3.0) * length * width * height;
    }

    /**
     * Computes and returns the surface area of the pyramid.
     * Formula: Base Area + Lateral Surface Area
     *
     * @return The total surface area of the pyramid.
     */
    public double calculateSurfaceArea() {
        double baseArea = length * width;
        double lateralArea = (length + width) * slantHeight;
        return baseArea + lateralArea;
    }

    /**
     * Displays the pyramid's attributes along with its calculated volume and surface area.
     */
    public void printPyramidDetails() {
        System.out.println("Pyramid Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Slant Height: " + slantHeight);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}