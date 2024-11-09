/*
 * Ryan Brinkman
 * Evens
 * Page 134
 * 9/24/2024
 */

public class Evens
{
    public static void main(String[] args)
    {
        // Declare variables
        int num = 2;

        // Calculate and Display
        while (num <= 999999999)
        {
            num += 2;

            if (num % 10 == 0)
            {
                System.out.println(num);

            }
        }
    }
}