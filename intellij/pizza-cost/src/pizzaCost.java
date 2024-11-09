/*
Ryan Brinkman
Pizza Cost
Page 99
8/29/2024
*/

import java.util.Scanner;

public class pizzaCost
{
    public static void main(String[] args)
    {
        int diameter;
        double cost;

        // obtain information
        Scanner slave = new Scanner(System.in);

        System.out.print("Enter the diameter of the pizza in inches: ");
        diameter = slave.nextInt();

        // calculate
        cost = 0.05 * diameter * diameter;
        cost = cost + 1.75;

        // display results
        System.out.printf("The cost of the pizza is $%.2f%n", cost);

        slave.close();
    }
}