/*
 * Ryan Brinkman
 * Election
 * Page 103
 * 9/4/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class Election
{
    public static void main(String[] args)
    {
        // Declare variables
        int awbreyNyVotes;
        int martinezNyVotes;
        int awbreyNjVotes;
        int martinezNjVotes;
        int awbreyCtVotes;
        int martinezCtVotes;
        double awbreyVotes;
        double martinezVotes;
        double totalVotes;
        double awbreyPercent;
        double martinezPercent;

        Scanner slave = new Scanner(System.in); // Create scanner object

        // Obtain user input
        System.out.println("Election results for New York: ");
        System.out.print("Awbrey: ");
        awbreyNyVotes = slave.nextInt();

        System.out.print("Martinez: ");
        martinezNyVotes = slave.nextInt();

        System.out.println();

        System.out.println("Election results for New Jersey: ");
        System.out.print("Awbrey: ");
        awbreyNjVotes = slave.nextInt();

        System.out.print("Martinez: ");
        martinezNjVotes = slave.nextInt();

        System.out.println();

        System.out.println("Election results for Connecticut: ");
        System.out.print("Awbrey: ");
        awbreyCtVotes = slave.nextInt();

        System.out.print("Martinez: ");
        martinezCtVotes = slave.nextInt();

        System.out.println();

        slave.close(); // Close scanner

        // Calculate
        awbreyVotes = awbreyNyVotes + awbreyNjVotes + awbreyCtVotes;
        martinezVotes = martinezNyVotes + martinezNjVotes + martinezCtVotes;
        totalVotes = awbreyVotes + martinezVotes;
        awbreyPercent = (awbreyVotes / totalVotes) * 100;
        martinezPercent = (martinezVotes / totalVotes) * 100;

        // Display results
        System.out.println("Candidate\t\t\tVotes\t\t\tPercentage");
        System.out.printf("Awbrey\t\t\t\t%d\t\t\t%.2f%%%n", (int) awbreyVotes, awbreyPercent);
        System.out.printf("Martinez\t\t\t%d\t\t\t%.2f%%%n", (int) martinezVotes, martinezPercent);
        System.out.printf("TOTAL VOTES:\t\t%d%n", (int) totalVotes);

    }
}