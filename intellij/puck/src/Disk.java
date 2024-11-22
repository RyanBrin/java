/**
 * Represents a disk, which is a circle with an added thickness dimension.
 */
public class Disk extends Circle {
    private double thickness;

    /**
     * Default constructor that initializes the thickness to 1.
     */
    public Disk() {
        super(); // Calls the Circle default constructor
        this.thickness = 1;
    }

    /**
     * Constructor that initializes the radius and thickness.
     *
     * @param radius    The radius of the disk.
     * @param thickness The thickness of the disk.
     */
    public Disk(double radius, double thickness) {
        super(radius);
        this.thickness = thickness;
    }

    /**
     * Sets the thickness of the disk.
     *
     * @param thickness The new thickness value.
     */
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    /**
     * Gets the thickness of the disk.
     *
     * @return The thickness of the disk.
     */
    public double getThickness() {
        return thickness;
    }

    /**
     * Calculates and returns the volume of the disk.
     *
     * @return The volume of the disk.
     */
    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * thickness;
    }

    /**
     * Calculates and returns the surface area of the disk.
     *
     * @return The surface area of the disk.
     */
    public double getSurfaceArea() {
        return 2 * super.getArea() + thickness * super.getCircumference();
    }

    /**
     * Returns a string representation of the disk, including its radius and thickness.
     *
     * @return A string representation of the disk.
     */
    @Override
    public String toString() {
        return super.toString() + "\nThe thickness of the disk is: " + thickness;
    }
}
