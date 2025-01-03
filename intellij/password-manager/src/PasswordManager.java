/*
 * Project: Password Manager
 * Author: Ryan Brinkman
 * Date: 12/18/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/password-manager/
 */

/**
 * Import necessary libraries
 */
import java.io.File; // import java.io.File to allow file functions to be imported.
import java.io.FileWriter; // import java.io.FileWriter to allow file functions to be imported.
import java.io.IOException; // import java.io.IOException to allow exceptions to be thrown and handled properly.
import java.util.Scanner; // import java.util.Scanner to allow user inputs to be processed.

/**
 * A simple command-line password manager for managing accounts and service passwords.
 */
public class PasswordManager {

    /**
     * The main entry point for the Password Manager application.
     * Initializes the application and displays the main menu.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner object
        PasswordManagerApp app = new PasswordManagerApp(scanner); // Create password manager object

        // Main loop for displaying the main menu and handling user choices.
        while (true) {
            app.displayMainMenu(); // Call display main menu function within the Password Manager application class.
            int choice = app.getChoice();

            // Switch statement to handle user choices and perform the corresponding actions.
            switch (choice) {
                case 1 -> app.createAccount();
                case 2 -> app.logIn();
                case 3 -> app.exitProgram();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

/**
 * Handles the core functionalities of the Password Manager application.
 */
class PasswordManagerApp {
    private final Scanner scanner; // Create scanner object privately used by PasswordManagerApp class

    /**
     * Constructs a PasswordManagerApp instance with the provided scanner.
     *
     * @param scanner The Scanner object used for user input.
     */
    public PasswordManagerApp(Scanner scanner) {
        this.scanner = scanner; // Assign the scanner to the application
    }

    /**
     * Displays the main menu options to the user.
     */
    public void displayMainMenu() {
        System.out.println("\nWelcome to Password Manager!");
        System.out.println("1. Create an Account");
        System.out.println("2. Log In");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    /**
     * Gets the user's choice from the menu.
     *
     * @return The user's choice as an integer. Returns -1 if input is invalid.
     */
    public int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) { // Catch error for invalid input unconvertible to integer
            return -1; // Invalid input return
        }
    }

    /**
     * Exits the program gracefully, closing resources and displaying a goodbye message.
     */
    public void exitProgram() {
        System.out.println("Thank you for using Password Manager. Goodbye!");
        scanner.close(); // Close scanner object.
        System.exit(0); // Exit the application.
    }

    /**
     * Creates a new user account by prompting for a username and master password.
     * Ensures the username is unique and saves the account information to a file.
     */
    public void createAccount() {
        // Assign the username and master password to variables
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        System.out.print("Enter a master password: ");
        String masterPassword = scanner.nextLine();

        // Create a new User object with the provided username and master password
        User user = new User(username, masterPassword);

        // Check if the username already exists and handle the case if it does.
        String userFilePath = "data/users/" + user.getUsername() + ".txt";

        if (new File(userFilePath).exists()) {
            System.out.println("Username already exists. Please choose another.");
            return;
        }

        // Create directories for the user and their services and display a success message.
        createDirectories("data/users", "data/users/" + user.getUsername() + "-services");

        if (writeToFile(userFilePath, "masterPassword:" + user.getPassword())) {
            System.out.println("Account created successfully!");
        }
    }

    /**
     * Logs a user into their account by verifying their username and master password.
     * If credentials are valid, allows the user to manage their passwords.
     */
    public void logIn() {
        // Prompt the user to enter their username and master password.
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your master password: ");
        String masterPassword = scanner.nextLine();

        // Read the master password from the user's file and compare it with the entered master password.
        String userFilePath = "data/users/" + username + ".txt";

        // Handle case where the user file path does not exist
        if (!new File(userFilePath).exists()) {
            System.out.println("User not found. Please create an account first.");
            return;
        }

        // Read the master password from the user's file and compare it with the entered master password.
        if (readFirstLine(userFilePath).equals("masterPassword:" + masterPassword)) {
            System.out.println("Login successful. Welcome back, " + username + "!");
            User user = new User(username, masterPassword); // Save users details to an object for later use.
            managePasswords(user); // Upon successful login attempt bring user to password manager interface.
        } else {
            System.out.println("Incorrect username or password. Please try again.");
        }
    }

    /**
     * Manages the user's service passwords by displaying options for viewing,
     * creating, editing, or deleting passwords.
     *
     * @param user The logged-in user.
     */
    private void managePasswords(User user) {
        String serviceDirPath = "data/users/" + user.getUsername() + "-services/"; // Get the service directory.
        File serviceDir = new File(serviceDirPath); // Create a file object containing the service directory path.

        // Main loop for the service password management
        while (true) {
            displayPasswordMenu(); // Display the password menu
            int choice = getChoice();

            // Switch statement to handle user choices and perform the corresponding actions.
            switch (choice) {
                case 1 -> viewSavedPasswords(serviceDir);
                case 2 -> viewSpecificPassword(serviceDir);
                case 3 -> createServicePassword(serviceDir);
                case 4 -> editServicePassword(serviceDir);
                case 5 -> deleteServicePassword(serviceDir);
                case 6 -> {
                    System.out.println("Logged out successfully.");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the password management menu options to the user.
     */
    private void displayPasswordMenu() {
        System.out.println("\nPassword Management Menu:");
        System.out.println("1. View saved passwords");
        System.out.println("2. View a specific password");
        System.out.println("3. Create a new service password");
        System.out.println("4. Edit a service password");
        System.out.println("5. Delete a service password");
        System.out.println("6. Logout");
        System.out.print("Choose an option: ");
    }

    /**
     * Creates directories for storing user and service data.
     *
     * @param paths Varargs of directory paths to create.
     */
    private void createDirectories(String... paths) { // Allows for a non-specified number of paths to be specified.
        for (String path : paths) {
            new File(path).mkdirs(); // Create a directory and any non-existing parent directories used with the directory.
        }
    }

    /**
     * Writes data to a specified file.
     *
     * @param filePath The file path where the data will be written.
     * @param data     The data to write.
     * @return True if the operation was successful, false otherwise.
     */
    private boolean writeToFile(String filePath, String data) {
        /**
         * Try to write the data to the specified file and return true if the operation was successful.
         * Handle the IOException exception any file errors are thrown
         */
        try (FileWriter writer = new FileWriter(filePath)) { // Initialize file writer object and specify the file path used
            writer.write(data + "\n"); // Write data to the file
            return true;
        } catch (IOException e) { // Catch exception and print the error message
            System.out.println("Error writing to " + filePath);
            return false;
        }
    }

    /**
     * Reads the first line from a specified file.
     *
     * @param filePath The file path to read from.
     * @return The first line of the file, or an empty string if an error occurs.
     */
    private String readFirstLine(String filePath) {
        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            return fileScanner.hasNextLine() ? fileScanner.nextLine() : ""; // Read the first line and determine if first line is empty
        } catch (IOException e) {
            System.out.println("Error reading from " + filePath);
            return "";
        }
    }

    /**
     * Displays a list of saved passwords for the user.
     *
     * @param serviceDir The directory containing service password files.
     */
    private void viewSavedPasswords(File serviceDir) {
        File[] files = serviceDir.listFiles(); // Create a list of service files
        if (files == null || files.length == 0) { // No saved passwords found
            System.out.println("No saved passwords found.");
            return;
        }

        // Display the saved passwords
        System.out.println("\nSaved Services:");
        for (File file : files) { // Create a list of service files
            System.out.println(file.getName().replaceFirst("\\.txt$", "")); // Exclude the service '.txt' from the list
        }
    }

    /**
     * Views the password for a specific service.
     *
     * @param serviceDir The directory containing service password files.
     */
    private void viewSpecificPassword(File serviceDir) {
        System.out.print("Enter the service name: ");
        String serviceName = scanner.nextLine();

        File serviceFile = new File(serviceDir, serviceName + ".txt"); // Create a service file object with '.txt' extension
        if (!serviceFile.exists()) { // Check if the service file exists else return an error message
            System.out.println("Service not found.");
            return;
        }

        // If the service exists read the service file password
        try (Scanner fileScanner = new Scanner(serviceFile)) { // Try to read the service file password
            /**
             * Read the password from the service file input.
             * Password split at the ':' into two parts ('[0]' & '[1]').
             * Password is read from the second position of the array '[1]' ('password:' contained in '[0]' position)
             */
            System.out.println("Password: " + fileScanner.nextLine().split(":")[1]);
        } catch (IOException e) { // Handle any IOException errors thrown and print error message
            System.out.println("Error reading password file.");
        }
    }

    /**
     * Creates a new password for a specified service.
     *
     * @param serviceDir The directory to store the service password file.
     */
    private void createServicePassword(File serviceDir) {
        // Get service name and password specified by the user
        System.out.print("Enter the service name: ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter the password for " + serviceName + ": ");
        String password = scanner.nextLine();

        // Create a new service file with the service name and password
        File serviceFile = new File(serviceDir, serviceName + ".txt");
        writeToFile(serviceFile.getAbsolutePath(), "password:" + password);
    }

    /**
     * Edits an existing password for a specified service.
     *
     * @param serviceDir The directory containing service password files.
     */
    private void editServicePassword(File serviceDir) {
        // Get service name specified by the user
        System.out.print("Enter the service name: ");
        String serviceName = scanner.nextLine();

        File serviceFile = new File(serviceDir, serviceName + ".txt");
        if (!serviceFile.exists()) { // Check if service file exists
            System.out.println("Service not found.");
            return;
        }

        // Get new service password specified by the user
        System.out.print("Enter the new password for " + serviceName + ": ");
        String password = scanner.nextLine();

        // Write new service password to the file
        writeToFile(serviceFile.getAbsolutePath(), "password:" + password);
    }

    /**
     * Deletes a service password file for a specified service.
     * Prompts the user to enter a service name, attempts to delete the corresponding
     * password file, and provides feedback on the success or failure of the operation.
     *
     * @param serviceDir The directory containing service password files.
     */
    private void deleteServicePassword(File serviceDir) {
        // Get service name specified by user
        System.out.print("Enter the service name: ");
        String serviceName = scanner.nextLine();

        // Create object containing absolute path to service password file
        File serviceFile = new File(serviceDir, serviceName + ".txt");
        if (serviceFile.delete()) { // Delete password file and return success message if successful
            System.out.println("Password deleted for service " + serviceName);
        } else {
            System.out.println("Failed to delete or service not found.");
        }
    }
}