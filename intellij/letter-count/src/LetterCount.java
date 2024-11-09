/*
 * Ryan Brinkman
 * Letter Count
 * Page None
 * 10/4/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class LetterCount
{
    public static void main(String[] args)
    {
        // Declare variables
        String word;
        int middleIndex;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        String search;
        int position;
        int space;
        String test;

        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.println("Enter a word: ");
        word = scanner.nextLine();

        // Display the length of the word
        System.out.println("The length of the word is: " + word.length());

        // Display the first character of the word
        System.out.println("The first character of the word is: " + word.substring(0, 1));

        // Get the middle index
        middleIndex = word.length() / 2;

        // Determine if word has an even number of characters and display the middle characters of the word
        if (word.length() % 2 == 0)
        {
            System.out.println("The middle characters of the word are: " + word.substring(middleIndex - 1, middleIndex + 1));

        }
        else
        {
            System.out.println("The middle character of the word is: " + word.substring(middleIndex, middleIndex + 1));

        }

        // Display the last character of the word
        System.out.println("The last character of the word is: " + word.substring(word.length() - 1));

        // Convert word to lower case
        word = word.toLowerCase();

        // Count occurrences of vowels in the word
        for (int j = 0; j < word.length(); j++)
        {
            if (word.charAt(j) == 'a')
            {
                a++;

            }
            else if (word.charAt(j) == 'e')
            {
                e++;

            }
            else if (word.charAt(j) == 'i')
            {
                i++;

            }
            else if (word.charAt(j) == 'o')
            {
                o++;

            }
            else if (word.charAt(j) == 'u')
            {
                u++;

            }
        }

        // Display the count of each vowel
        System.out.println("The count of 'a' is: " + a);
        System.out.println("The count of 'e' is: " + e);
        System.out.println("The count of 'i' is: " + i);
        System.out.println("The count of 'o' is: " + o);
        System.out.println("The count of 'u' is: " + u);

        // Search for a specific letter in the word
        System.out.println("Enter a search substring: ");
        search = scanner.next();

        // Convert search letter to lower case
        search = search.toLowerCase();

        // Search the string
        position = word.indexOf(search);
        space = word.indexOf(" ");

        // Display results
        System.out.println("The position of '" + search + "' is: " + position);
        System.out.println("The position of the first space is: " + space);

        // Compare the length of the word and the test word
        System.out.println("Enter a word to compare: ");
        test = scanner.next();

        scanner.close(); // Close the scanner object

        if (word.compareTo(test) == 0)
        {
            System.out.println(search + "and " + test + " are the same alphabetically");

        }
        else if (word.compareTo(test) > 0)
        {
            System.out.println(search + " comes after " + test + " alphabetically");

        }
        else if (word.compareTo(test) < 0)
        {
            System.out.println(search + " comes before " + test + " alphabetically");

        }
    }
}
