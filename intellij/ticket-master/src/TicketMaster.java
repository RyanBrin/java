/*
 * Project: Ticket Master
 * Author: Ryan Brinkman
 * Date: February 19, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/ticket-master/
 */

import java.util.Scanner;

/**
 * TicketMaster application that allows users to buy and cancel tickets for different seating sections.
 * The program maintains seating arrangements and enforces seat availability and payment processing.
 */
public class TicketMaster {
    static Scanner scanner = new Scanner(System.in);
    static Section[] sections = {
            new Section("A", 6, 9, 60.0),
            new Section("F", 6, 9, 75.0),
            new Section("R", 6, 9, 90.0),
            new Section("L", 6, 9, 80.0)
    };

    /**
     * Main method to handle user interactions.
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n🎟️ Welcome to Ticket Master 🎟️");
            System.out.println("1. Buy Tickets");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Print Seating Arrangement");
            System.out.println("4. Show Seat Pricing");
            System.out.println("5. Exit application");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> reserveSeats();
                case 2 -> cancelReservation();
                case 3 -> printSeats();
                case 4 -> showSeatPricing();
                case 5 -> {
                    System.out.println("Thank you for using Ticket Master. Goodbye! 👋");
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Allows the user to reserve seats and processes payment.
     */
    private static void reserveSeats() {
        Section section = chooseSection();
        if (section == null) return;

        System.out.print("Enter the number of seats to reserve: ");
        int numSeats = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your name for the reservation: ");
        String name = scanner.nextLine();

        for (int i = 0; i < numSeats; i++) {
            System.out.print("Enter seat number (e.g., A1): ");
            String seatNumber = scanner.next().toUpperCase();
            if (!section.reserveSeat(seatNumber, name)) {
                System.out.println("❌ Seat not available. Choose another seat.");
                i--; // Retry seat selection
            }
        }
        System.out.println("✅ Reservation successful! Please proceed with payment.");
        if (!processPayment(section, numSeats)) {
            System.out.println("❌ Payment failed. Canceling reservation.");
            section.cancelMultipleReservations(name);
        }
    }

    /**
     * Allows the user to cancel a seat reservation.
     */
    private static void cancelReservation() {
        Section section = chooseSection();
        if (section == null) return;

        System.out.print("Enter seat number to cancel: ");
        String seatNumber = scanner.next().toUpperCase();

        if (section.cancelReservation(seatNumber)) {
            System.out.println("✅ Reservation canceled.");
        } else {
            System.out.println("❌ No reservation found for that seat.");
        }
    }

    /**
     * Prints the seating arrangement for all sections.
     */
    private static void printSeats() {
        for (Section section : sections) {
            System.out.println("\n🎭 Section " + section.getName());
            section.printSeats();
        }
    }

    /**
     * Displays seat pricing for each section.
     */
    private static void showSeatPricing() {
        for (Section section : sections) {
            System.out.println("\n💲 Pricing for Section " + section.getName() + " ($" + section.getPrice() + " per seat)");
            section.showPricing();
        }
    }

    /**
     * Allows the user to select a seating section.
     * @return the selected Section object, or null if the selection is invalid.
     */
    private static Section chooseSection() {
        System.out.println("\nAvailable Sections: A, F, R, L");
        System.out.print("Enter section: ");
        String sectionName = scanner.next().toUpperCase();

        for (Section section : sections) {
            if (section.getName().equals(sectionName)) {
                return section;
            }
        }
        System.out.println("❌ Invalid section choice.");
        return null;
    }

    /**
     * Processes the payment for a ticket reservation.
     * @param section The section where seats were reserved.
     * @param numSeats The number of seats reserved.
     * @return true if payment is successful, false otherwise.
     */
    private static boolean processPayment(Section section, int numSeats) {
        double total = section.getPrice() * numSeats;
        System.out.printf("💳 Total amount: $%.2f\n", total);
        System.out.print("Enter payment amount: $");
        double payment = scanner.nextDouble();
        return payment >= total;
    }
}