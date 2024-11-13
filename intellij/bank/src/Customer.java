/*
 * Customer Class
 */

public class Customer {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zip;

    /**
     * Default constructor method
     */
    public Customer() {
        firstName = "Ryan";
        lastName = "Brinkman";
        street = "4825 Granite Dr";
        city = "Bismarck";
        state = "ND";
        zip = "58503";
    }

    /**
     * Constructor method
     * @param firstName Customer's first name
     * @param lastName  Customer's last name
     * @param street    Customer's street address
     * @param city      Customer's city
     * @param state     Customer's state
     * @param zip       Customer's ZIP code
     */
    public Customer(String firstName, String lastName, String street, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
     * Setter method
     *
     * @param firstName Set customer's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Setter method
     *
     * @param lastName Set customer's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Setter method
     *
     * @param street Set customer's street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Setter method
     *
     * @param city Set customer's city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Setter method
     *
     * @param state Set customer's state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Setter method
     *
     * @param zip Set customer's ZIP code
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Getter method
     *
     * @return Customer's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter method
     *
     * @return Customer's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Getter method
     *
     * @return Customer's street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Getter method
     *
     * @return Customer's city
     */
    public String getCity() {
        return city;
    }

    /**
     * Getter method
     *
     * @return Customer's state
     */
    public String getState() {
        return state;
    }

    /**
     * Getter method
     *
     * @return Customer's ZIP code
     */
    public String getZip() {
        return zip;
    }

    /**
     * Getter method
     *
     * @return Customer's information as a String
     */
    public String toString() {
        return firstName + " " + lastName + "\n" + street + "\n" + city + ", " + state + " " + zip;
    }
}
