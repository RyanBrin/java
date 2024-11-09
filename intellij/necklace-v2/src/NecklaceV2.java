/*
 * Ryan Brinkman
 * Necklace v2.0
 * Page 153
 * 10/3/2024
 */

public class NecklaceV2
{
    public static void main(String[] args)
    {
        // Declare variables
        int num1;
        int num2;
        int sum;
        int steps;

        // Iterate through all possible numbers (0-9) and print the sequence and steps
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                // Initial x and y values
                steps = 0;
                num1 = x;
                num2 = y;

                // Print the starting numbers
                System.out.print(x + " " + y + " ");

                // Print the sequence until the starting numbers are reached again
                do
                {
                    sum = x + y;
                    x = y;
                    y = sum % 10;

                    steps++; // Increment the step counter

                    System.out.print(y + " "); // Print the sequence

                }
                while (x != num1 || y != num2);

                // Display numbers and # steps taken to close
                System.out.printf("-> [" + x + "/" + y + "] took " + steps + " steps!");

                System.out.println();

            }
        }
    }
}