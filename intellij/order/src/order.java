/*
Ryan Brinkman
Order
Page 101
8/30/24
*/

import java.util.Scanner;

public class order
{
    public static void main(String[] args)
    {
        double burgers;
        double fries;
        double sodas;
        double cost;
        double subtotal;
        double tax;
        double total;
        double cash;
        double change;

        // obtain information
        Scanner slave = new Scanner(System.in);

        System.out.print("Enter the number of burgers: ");
        burgers = slave.nextInt();

        System.out.print("Enter the number of fries: ");
        fries = slave.nextInt();

        System.out.print("Enter the number of sodas: ");
        sodas = slave.nextInt();

        // calculate
        burgers = burgers * 1.69;
        fries = fries * 1.09;
        sodas = sodas * 0.99;
        cost = burgers + fries + sodas;
        subtotal = cost;
        tax = cost * 0.065;
        total = subtotal + tax;

        // display results
        System.out.printf("Total before tax: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Final Total: $%.2f%n", total);

        // get cash and calculate change
        System.out.print("Enter amount tendered: ");
        cash = slave.nextDouble();
        change = cash - total;

        // display change
        System.out.printf("Change: $%.2f%n", change);

        slave.close();
    }
}
