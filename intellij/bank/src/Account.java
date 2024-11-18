/**
 * Account class
 */

import java.text.NumberFormat;

public class Account {
    private double balance;
    private Customer customer;

    /**
     * Constructor method
     */
    public Account() {
        balance = 0.0;
        customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setStreet("123 Main St");
        customer.setCity("Anytown");
        customer.setState("CA");
        customer.setZip("12345");
    }

    /**
     * Constructor method
     */
    public Account(double balance, String firstName, String lastName, String street, String city, String state, String zip) {
        this.balance = balance;
        this.customer = new Customer();
        this.customer.setFirstName(firstName);
        this.customer.setLastName(lastName);
        this.customer.setStreet(street);
        this.customer.setCity(city);
        this.customer.setState(state);
        this.customer.setZip(zip);
    }

    /**
     * Getter method
     *
     * @return Customer's balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Setter method
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Setter method
     */
    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Error: Insufficient funds for withdrawal.");
        }
    }

    /**
     * Setter method
     */
    public void changeAdress(String street, String city, String state, String zip) {
        customer.setStreet(street);
        customer.setCity(city);
        customer.setState(state);
        customer.setZip(zip);
    }

    /**
     * Getter method
     *
     * @return formatted balance
     */
    public String getFormattedBalance() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(balance);
    }

    /**
     * Getter method
     *
     * @return Customer's information and balance as a string
     */
    @Override
    public String toString() {
        return customer.toString() + "Current balance: " + getFormattedBalance();
    }

    /**
     * Setter method
     *
     * @param newStreet The new street
     * @param newCity   The new city
     * @param newState  The new state
     * @param newZip    The new zip
     */
    public void changeAddress(String newStreet, String newCity, String newState, String newZip) {
        customer.setStreet(newStreet);
        customer.setCity(newCity);
        customer.setState(newState);
        customer.setZip(newZip);
        System.out.println("Address changed successfully.");
    }

    /**
     * Setter method
     *
     * @param newPhone The new phone
     */
    public void changePhone(String newPhone) {
        customer.setPhoneNum(newPhone);
        System.out.println("Phone number changed successfully.");
    }

    /**
     * Getter method
     *
     * @return Customer's first name and last name
     */
    public String getName() {
        return customer.getFirstName() + " " + customer.getLastName();
    }
}