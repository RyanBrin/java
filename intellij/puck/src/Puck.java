/**
 * Puck Class
 */
public class Puck extends Disk {
    private double weight;

    /**
     * Default constructor method
     */
    public Puck() {
        weight = 1;
    }

    /**
     * Constructor method that initializes the weight thickness and radius
     *
     * @param weight    The weight of the puck
     * @param thickness The thickness of the puck
     * @param radius    The radius of the puck
     */
    public Puck(double weight, double thickness, double radius) {
        super(thickness, radius);
        this.weight = weight;
    }

    /**
     * Setter method that initializes weight based off user input
     *
     * @param weight The weight of the puck
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Getter method that returns the weight of the puck
     *
     * @return The weight of the puck
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns a formatted string representation of the puck object
     *
     * @return result A string representation of the puck object
     */
    public String toString() {
        String result = "The puck has a weight of " + weight + " and a thickness of " + super.getThickness() + " and a radius of " + super.getRadius();
        return result;
    }
}
