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
        Customer customer = new Customer();
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
        Customer temp = new Customer(firstName, lastName, street, city, state, zip);
    }

    /**
     * Getter method
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
    public void withdrawl(double ammount) {
        balance -= ammount;
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
     * @return formatted balance
     */
    public String getFormattedBalance() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(balance);
    }

    @Override
    public String toString() {
        return "Account [balance=" + getFormattedBalance() + ", customer=" + customer + "]";
    }
}
