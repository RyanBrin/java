/**
 * Customer Class
 */

public class Customer {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    /**
     * Default constructor.
     * Initializes a customer with default values.
     */
    public Customer() {
        this("Ryan", "Brinkman", "4825 Granite Dr", "Bismarck", "ND", "58503", "123-456-7890");
    }

    /**
     * Parameterized constructor.
     *
     * @param firstName Customer's first name.
     * @param lastName  Customer's last name.
     * @param street    Customer's street address.
     * @param city      Customer's city.
     * @param state     Customer's state.
     * @param zip       Customer's ZIP code.
     * @param phoneNumber  Customer's phone number.
     */
    public Customer(String firstName, String lastName, String street, String city, String state, String zip, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the customer's full details as a formatted string.
     *
     * @return A string representation of the customer.
     */
    @Override
    public String toString() {
        return String.format(
                "%s %s\n%s\n%s, %s %s\nPhone: %s",
                firstName, lastName, street, city, state, zip, phoneNumber
        );
    }
}