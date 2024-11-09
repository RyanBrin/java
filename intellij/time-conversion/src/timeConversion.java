/*
Ryan Brinkman
Time Conversion
Page 101
8/30/24
*/

import java.util.Scanner;

public class timeConversion
{
    public static void main(String[] args)
    {
        int minutes;
        int hours;

        Scanner slave = new Scanner(System.in);

        // obtain information
        System.out.print("Enter the time in minutes: ");
        minutes = slave.nextInt();

        // calculate
        hours = minutes / 60;
        minutes = minutes % 60;

        slave.close();

        // display results
        System.out.printf("The time is: %02d:%02d%n" , hours, minutes);

    }
}