/*
 * Ryan Brinkman
 * Translator
 * Prompt #4
 * 10/30/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        // Declare variables
        int choice;

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Display menu options to user
        System.out.println("Choose a language to translate from:");
        System.out.println("1. English to Spanish");
        System.out.println("2. Spanish to English");
        System.out.println("3. Instructions");

        // Obtain user input
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        // Switch case for user input
        switch (choice) {
            case 1:
                translateEnglishToSpanish();
                break;
            case 2:
                translateSpanishToEnglish();
                break;
            case 3:
                displayInstructions();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        scanner.close(); // Close the scanner
    }

    // Method to translate English to Spanish
    private static void translateEnglishToSpanish() {
        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter a word in English: ");
        String englishPhrase = scanner.nextLine();

        // Translate the phrase
        if (englishPhrase.equalsIgnoreCase("hello")) {
            System.out.println("Translation: hola");
        }
        else if (englishPhrase.equalsIgnoreCase("goodbye")) {
            System.out.println("Translation: adios");
        }
        else if (englishPhrase.equalsIgnoreCase("yes")) {
            System.out.println("Translation: si");
        }
        else if (englishPhrase.equalsIgnoreCase("friend")) {
            System.out.println("Translation: amigo");
        }
        else if (englishPhrase.equalsIgnoreCase("end")) {
            System.out.println("Translation: fin");
        }
        else {
            System.out.println("Unknown word. Please try again.");
        }
    }
    
    // Method to translate Spanish to English
    private static void translateSpanishToEnglish() {
        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.print("Enter a word in Spanish: ");
        String spanishPhrase = scanner.nextLine();

        // Translate the phrase
        if (spanishPhrase.equalsIgnoreCase("hola")) {
            System.out.println("Translation: hello");
        }
        else if (spanishPhrase.equalsIgnoreCase("adios")) {
            System.out.println("Translation: goodbye");
        }
        else if (spanishPhrase.equalsIgnoreCase("si")) {
            System.out.println("Translation: yes");
        }
        else if (spanishPhrase.equalsIgnoreCase("amigo")) {
            System.out.println("Translation: friend");
        }
        else if (spanishPhrase.equalsIgnoreCase("fin")) {
            System.out.println("Translation: end");
        }
        else {
            System.out.println("Unknown word. Please try again.");
        }
    }
    
    // Method to display instructions
    private static void displayInstructions() {
        // Display instructions to user
        System.out.println("Welcome to the Translator!");
        System.out.println("This program allows you to translate English to Spanish and Spanish to English.");
        System.out.println("Choose a language from the menu options and enter a word to translate.");
        System.out.println("Known translations for English to Spanish are: 'hello', 'goodbye', 'yes', 'friend', and 'end'.");
        System.out.println("Known translations for Spanish to English are: 'hola', 'adios', 'si', 'amigo', and 'fin'.");
    }
}