/*
* Ryan Brinkman
* Sleep
* Page 101
* 8/30/2024
*/

import java.util.Scanner;

public class Sleep
{
    public static void main(String[] args)
    {
        // declare variables
        int birthYear;
        int birthMonth;
        int birthDay;
        int currentYear;
        int currentMonth;
        int currentDay;
        int days;
        int hours;

        Scanner slave = new Scanner(System.in); // create scanner object to read user input

        // get user input for birthdate and today's date
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        birthYear = slave.nextInt();
        System.out.print("Month: ");
        birthMonth = slave.nextInt();
        System.out.print("Day: ");
        birthDay = slave.nextInt();
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        currentYear = slave.nextInt();
        System.out.print("Month: ");
        currentMonth = slave.nextInt();
        System.out.print("Day: ");
        currentDay = slave.nextInt();

        // calculate the number of days and hours since birthdate
        days = ((currentYear * 365) + (currentMonth * 30) + (currentDay)) - ((birthYear * 365) + (birthMonth * 30) + (birthDay));
        hours = days * 8;

        // display results
        System.out.println("You have been alive for " + days + " days.");
        System.out.println("You have slept for " + hours + " hours.");

        slave.close(); // closer scanner object to prevent resource leakage
    }
}