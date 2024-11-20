/**
 * Disk class
 */
public class Disk extends Circle {
    private double thickness;

    /**
     * Default constructor method to initialize thickness to 1
     */
    public Disk() {
        thickness = 1;
    }

    /**
     * Constructor method to initialize thickness based on
     *
     * @param radius    Disk's radius
     * @param thickness Disk's thickness'
     */
    public Disk(double radius, double thickness) {
        super(radius);
        this.thickness = thickness;
    }

    /**
     * Setter method to set thickness to specified value
     */
    public void setThickness(double radius) {
        this.thickness = thickness;
    }

    /**
     * Getter method to get thickness
     * @return Disk's thickness
     */
    public double getThickness() {
        return thickness;
    }

    /**
     * Calculate and return the volume of the disk
     * @return Disk's volume
     */
    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * thickness;
    }

    /**
     * Calculate and return the surface area of the disk
     * @return Disk's surface area
     */
    public double getSurfaceArea() {
        return 2 * super.getArea() + thickness * super.getCircumference();
    }

    /**
     * Return a string representation of the Disk object's respected values
     * @return Disk's string representation
     */
    public String toString() {
        String diskString = super.toString();
        diskString +=  "\nThe thickness of the disk is" + thickness;
        return diskString;
    }
}
