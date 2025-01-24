/**
 * Pyramid Class
 * This class represents a square pyramid with specified base side length,
 * height, and slant height. It includes methods to calculate volume and surface area.
 */
public class Pyramid {
    private double length;       // Base side length (width = length for square base)
    private double height;       // Perpendicular height from base center to apex
    private double slantHeight;  // Slant height (triangle face height)

    /**
     * Default constructor initializes the pyramid with preset dimensions.
     */
    public Pyramid() {
        this.length = 6;
        this.height = 4;
        this.slantHeight = 5;
    }

    /**
     * Parameterized constructor to create a pyramid with custom dimensions.
     *
     * @param length      The base side length of the pyramid.
     * @param height      The perpendicular height from the base to the apex.
     * @param slantHeight The slant height of the pyramid's triangular faces.
     */
    public Pyramid(double length, double height, double slantHeight) {
        this.length = length;
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

    // ===================== MISSING VALUE SETTER METHODS =====================

    /**
     * Computes and sets the missing side length.
     * Formula: s = 2 * sqrt(l^2 - h^2)
     */
    public void noSideLength() {
        if (length == 0) {
            this.length = 2 * Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(height, 2));
        }
    }

    /**
     * Computes and sets the missing height.
     * Formula: h = sqrt(l^2 - (s/2)^2)
     */
    public void noHeight() {
        if (height == 0) {
            this.height = Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(length / 2.0, 2));
        }
    }

    /**
     * Computes and sets the missing slant height.
     * Formula: l = sqrt(h^2 + (s/2)^2)
     */
    public void noSlantHeight() {
        if (slantHeight == 0) {
            this.slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(length / 2.0, 2));
        }
    }

    // ===================== CALCULATION METHODS (NO MODIFICATION) =====================

    /**
     * Calculates and returns the missing side length without modifying the object.
     * Formula: s = 2 * sqrt(l^2 - h^2)
     */
    public double calculateLength() {
        return 2 * Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(height, 2));
    }

    /**
     * Calculates and returns the missing height without modifying the object.
     * Formula: h = sqrt(l^2 - (s/2)^2)
     */
    public double calculateHeight() {
        return Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(length / 2.0, 2));
    }

    /**
     * Calculates and returns the missing slant height without modifying the object.
     * Formula: l = sqrt(h^2 + (s/2)^2)
     */
    public double calculateSlantHeight() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow(length / 2.0, 2));
    }

    // ===================== VOLUME & SURFACE AREA =====================

    /**
     * Computes and returns the volume of the pyramid.
     * Formula: V = (1/3) * s^2 * h
     *
     * @return The volume of the pyramid.
     */
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.pow(length, 2) * height;
    }

    /**
     * Computes and returns the surface area of the pyramid.
     * Formula: SA = s^2 + 2 * s * l
     *
     * @return The total surface area of the pyramid.
     */
    public double calculateSurfaceArea() {
        double baseArea = Math.pow(length, 2);
        double lateralArea = 2 * length * slantHeight;
        return baseArea + lateralArea;
    }

    // ===================== PRINT PYRAMID DETAILS =====================

    /**
     * Displays the pyramid's attributes along with its calculated volume and surface area.
     */
    public void printPyramidDetails() {
        System.out.println("Pyramid Details:");
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
        System.out.println("Slant Height: " + slantHeight);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}