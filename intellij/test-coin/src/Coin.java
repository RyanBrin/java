/*
 * Coin Class
 */

public class Coin
{
    private int faceUp;

    /**
     * Default Constructor Method
     * A Coin object is created. The faceUp value is initialized to 1 (Heads).
     */
    public Coin()
    {
        faceUp = 0;
    }

    /**
     * Getter Method
     * @return The current faceUp value of the coin (1 for Heads, 0 for Tails).
     */
    public String getFaceUp()
    {
        return faceUp == 1 ? "Heads" : "Tails";
    }

    /**
     * Setter Method
     * The coin's faceUp value is randomly changed to 1 or 0.
     * @return Returns faceUp value
     */
    public int flip()
    {
        faceUp = (int) (Math.random() * 2);
        return faceUp;
    }
}
