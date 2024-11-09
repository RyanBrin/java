/*
 * Ryan Brinkman
 * Surfs Up
 * Page 108
 * 9/9/2024
 */

import java.util.Scanner;

public class SurfsUp
{
    public static void main(String[] args)
    {
        // Declare variables
        int wave;

        Scanner slave = new Scanner(System.in); // Create new scanner object

        // Obtain user input
        System.out.print("Enter the height of the wave in feet: ");
        wave = slave.nextInt();

        slave.close(); // Close scanner

        // Calculate and display the surfing condition
        if (wave >= 6)
        {
            System.out.println("Great day for surfing!");

        }
        else if (wave >= 3)
        {
            System.out.println("Go bodyy boarding today!");

        }
        else if (wave >= 0)
        {
            System.out.println("Go for a swim.");

        }
        else
        {
            System.out.println("WHOA!, what kind of wave is that?");

        }
    }
}