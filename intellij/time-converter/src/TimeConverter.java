/*
 * Ryan Brinkman
 * Time Converter
 * Page None
 * 10/22/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class TimeConverter {
    public static void hoursToMinutes() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int hours = scanner.nextInt();

        double minutes = hours * 60;

        System.out.println(hours + " hours is equal to " + minutes + " minutes.");

        scanner.close();
    }
    public static void daysToHours() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        double hours = days * 24;

        System.out.println(days + " days is equal to " + hours + " hours.");

        scanner.close();
    }
    public static void minutesToHours() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        double hours = minutes / 60;

        System.out.println(minutes + " minutes is equal to " + hours + " hours.");

        scanner.close();
    }
    public static void hoursToDays() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int hours = scanner.nextInt();

        double minutes = hours * 60;

        System.out.println(hours + " hours is equal to " + minutes + " minutes.");

        scanner.close();
    }
    public static void main(String[] args) {

        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a conversion:");

        System.out.println("1. Hours to minutes");
        System.out.println("2. Days to hours");
        System.out.println("3. Minutes to hours");
        System.out.println("4. Hours to days");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                hoursToMinutes();
                break;
            case 2:
                daysToHours();
                break;
            case 3:
                minutesToHours();
                break;
            case 4:
                hoursToDays();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
