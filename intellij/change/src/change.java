/*
Ryan Brinkman
Change
Page 100
8/30/24
*/

import java.util.Scanner;

public class change
{
    public static void main(String[] args)
    {
        int cents;
        int quarters, dimes, nickels, pennies;

        // obtain information
        Scanner slave = new Scanner(System.in);

        System.out.print("Enter the change in cents: ");
        cents = slave.nextInt();

        // calculate
        quarters = cents / 25;
        cents = cents % 25;

        dimes = cents / 10;
        cents = cents % 10;

        nickels = cents / 5;
        cents = cents % 5;

        pennies = cents;

        // display results
        System.out.println("The minimum number of coins is:");
        System.out.println("     Quarters: " + quarters);
        System.out.println("     Dimes: " + dimes);
        System.out.println("     Nickels: " + nickels);
        System.out.println("     Pennies: " + pennies);

        slave.close();
    }
}
