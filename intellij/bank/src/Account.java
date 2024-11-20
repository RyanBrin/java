/**
 * Account Class
 */

import java.text.NumberFormat;

public class Account {
    private double balance;
    private Customer customer;

    /**
     * Default Constructor
     * Initializes a new account with default customer information and a balance of $0.00.
     */
    public Account() {
        this.balance = 0.0;
        this.customer = new Customer();
        this.customer.setFirstName("John");
        this.customer.setLastName("Doe");
        this.customer.setStreet("123 Main St");
        this.customer.setCity("Anytown");
        this.customer.setState("CA");
        this.customer.setZip("12345");
    }

    /**
     * Parameterized Constructor
     * Initializes a new account with the specified balance and customer information.
     *
     * @param balance   Initial account balance.
     * @param firstName Customer's first name.
     * @param lastName  Customer's last name.
     * @param street    Customer's street address.
     * @param city      Customer's city.
     * @param state     Customer's state.
     * @param zip       Customer's zip code.
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
     * Gets the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Deposit amount must be greater than $0.00.");
            return;
        }
        balance += amount;
        System.out.println("✅ Deposit of " + formatCurrency(amount) + " successful.");
    }

    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount The amount to withdraw.
     * @return True if the withdrawal was successful; false otherwise.
     */
    public boolean withdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be greater than $0.00.");
            return false;
        }
        if (amount > balance) {
            System.out.println("❌ Insufficient funds. Available balance: " + getFormattedBalance());
            return false;
        }
        balance -= amount;
        System.out.println("✅ Withdrawal of " + formatCurrency(amount) + " successful.");
        return true;
    }

    /**
     * Updates the customer's address.
     *
     * @param street The new street.
     * @param city   The new city.
     * @param state  The new state.
     * @param zip    The new zip code.
     */
    public void changeAddress(String street, String city, String state, String zip) {
        customer.setStreet(street);
        customer.setCity(city);
        customer.setState(state);
        customer.setZip(zip);
        System.out.println("✅ Address updated successfully.");
    }

    /**
     * Updates the customer's phone number.
     *
     * @param newPhone The new phone number.
     */
    public void changePhone(String newPhone) {
        customer.setPhoneNum(newPhone);
        System.out.println("✅ Phone number updated successfully.");
    }

    /**
     * Gets the formatted balance of the account.
     *
     * @return The balance formatted as a currency string.
     */
    public String getFormattedBalance() {
        return formatCurrency(balance);
    }

    /**
     * Formats a specified amount as currency.
     *
     * @param amount The amount to format.
     * @return The formatted currency string.
     */
    private String formatCurrency(double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(amount);
    }

    /**
     * Gets the full name of the customer associated with the account.
     *
     * @return The customer's first and last name.
     */
    public String getName() {
        return customer.getFirstName() + " " + customer.getLastName();
    }

    /**
     * Provides a string representation of the account details.
     *
     * @return A string containing customer details and the current balance.
     */
    @Override
    public String toString() {
        return customer.toString() + "Current Balance: " + getFormattedBalance();
    }
}