/**
 * Test Objects Class
 */
public class Number {
    private double num;

    /**
     * Default Constructor
     * @pre None
     * @post Initializes number to 1
     */
    public Number() {
        num = (int) (Math.random() * 10);
    }

    /**
     * Constructor with parameter
     * @param newNum User-entered value to use for initialization
     * @pre None
     * @post Initializes number to user value
     */
    public Number(double newNum) {
        num = newNum;
    }

    /**
     * Setter or modifier method
     * @param newNum A new value to set for num
     * @pre None
     * @post Changes the value of num to newNum
     */
    public void setNum(double newNum) {
        num = newNum;
    }

    /**
     * Getter method or accessor method
     * @return The current value of num
     * @pre None
     * @post Returns the current value of num
     */
    public double getNum() {
        return num;
    }
}
