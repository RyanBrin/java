/**
 * Project: Sleep
 * Author: Ryan Brinkman
 * Date: 1/14/2025
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/sleep/
 */

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        int birthYear = Scanner.nextInt();
        System.out.print("Month: ");
        int birthMonth = Scanner.nextInt();
        System.out.print("Day: ");
        int birthDay = Scanner.nextInt();

        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        int currentYear = Scanner.nextInt();
        System.out.print("Month: ");
        int currentMonth = Scanner.nextInt();
        System.out.print("Day: ");
        int currentDay = Scanner.nextInt();

        Scanner.close();

        int days = ((currentYear * 365) + (currentMonth * 30) + (currentDay)) - ((birthYear * 365) + (birthMonth * 30) + (birthDay));
        int hours = days * 8;

        System.out.println("You have been alive for " + days + " days.");
        System.out.println("You have slept for " + hours + " hours.");
    }
}