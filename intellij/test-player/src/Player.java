/**
 * Player Class
 * The {@code Player} class represents a player in a sports team with various attributes
 * such as name, number, jersey color, and hairstyle.
 */
public class Player {

    /** The first name of the player. */
    private String firstName;

    /** The last name of the player. */
    private String lastName;

    /** The jersey number of the player. */
    private int number;

    /** The color of the player's jersey. */
    private String jerseyColor;

    /** The hairstyle of the player. */
    private String hairstyle;

    /**
     * Constructs a new {@code Player} object with the specified attributes.
     *
     * @param firstName   The first name of the player.
     * @param lastName    The last name of the player.
     * @param number      The jersey number of the player.
     * @param jerseyColor The color of the player's jersey.
     * @param hairstyle   The hairstyle of the player.
     */
    public Player(String firstName, String lastName, int number, String jerseyColor, String hairstyle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.jerseyColor = jerseyColor;
        this.hairstyle = hairstyle;
    }

    /**
     * Gets the first name of the player.
     * @return The first name of the player.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the player.
     * @param firstName The new first name of the player.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the player.
     * @return The last name of the player.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the player.
     * @param lastName The new last name of the player.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the jersey number of the player.
     * @return The jersey number of the player.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the jersey number of the player.
     * @param number The new jersey number of the player.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gets the jersey color of the player.
     * @return The jersey color of the player.
     */
    public String getJerseyColor() {
        return jerseyColor;
    }

    /**
     * Sets the jersey color of the player.
     * @param jerseyColor The new jersey color of the player.
     */
    public void setJerseyColor(String jerseyColor) {
        this.jerseyColor = jerseyColor;
    }

    /**
     * Gets the hairstyle of the player.
     * @return The hairstyle of the player.
     */
    public String getHairstyle() {
        return hairstyle;
    }

    /**
     * Sets the hairstyle of the player.
     * @param hairstyle The new hairstyle of the player.
     */
    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    /**
     * Returns a string representation of the {@code Player} object.
     * @return A string containing player details.
     */
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", jerseyColor='" + jerseyColor + '\'' +
                ", hairstyle='" + hairstyle + '\'' +
                '}';
    }
}