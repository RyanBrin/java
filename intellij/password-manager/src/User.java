/**
 * User Class
 * Represents a user in the system.
 */
class User {
    private final String username;
    private final String password;

    /**
     * Constructs a new User with the specified username and password.
     *
     * @param username the user's username
     * @param password the user's password
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;

        /*
         * Because no one knows how to use '.this':
         * Used when you have an instance variable shadowed by a local variable
         * Use '.this' to reference that variable explicitly
         */
    }

    /**
     * Retrieves the username of the user.
     *
     * @return the username of the user
     */
    public String getUsername() {
        return username;
    }

    /**
     * Retrieves the password of the user.
     *
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }
}