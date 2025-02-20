/*
 * Project: Ticket Master
 * Author: Ryan Brinkman
 * Date: February 19, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/ticket-master/
 */

import java.util.Scanner;

public class TicketMaster {
    static Scanner scanner = new Scanner(System.in);
    static Seat[][] seats = new Seat[6][8];

    public static void main(String[] args) {
        initializeSeats();

        while (true) {
            System.out.println("\n🎟️ Welcome to Ticket Master 🎟️");
            System.out.println("1. Buy a Ticket");
            System.out.println("2. Cancel a Reservation");
            System.out.println("3. Print Seating Arrangement");
            System.out.println("4. Show Seat Pricing");
            System.out.println("5. Exit application");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> reserveSeat();
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
     * Initializes the seating arrangement with a fixed price of $60 for each seat.
     */
    private static void initializeSeats() {
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                String seatNumber = (char) ('A' + row) + Integer.toString(col + 1);
                seats[row][col] = new Seat(seatNumber, 60.0); // Fixed price
            }
        }
    }

    /**
     * Reserves a seat based on user input.
     * If the seat is already reserved, an error message is displayed.
     */
    public static void reserveSeat() {
        System.out.print("Enter the seat number (e.g., A1): ");
        String selectedSeat = scanner.next().toUpperCase();

        for (Seat[] row : seats) {
            for (Seat seat : row) {
                if (seat.getSeatNumber().equals(selectedSeat)) {
                    if (seat.reserve()) {
                        System.out.println("✅ Seat [" + selectedSeat + "] reserved for $" + seat.getPrice());
                    }
                    return;
                }
            }
        }
        System.out.println("❌ Seat not found or already reserved.");
    }

    /**
     * Cancels a reservation for a given seat.
     * If the seat is not reserved, an error message is displayed.
     */
    public static void cancelReservation() {
        System.out.print("Enter the seat number to cancel (e.g., A1): ");
        String seatToCancel = scanner.next().toUpperCase();

        for (Seat[] row : seats) {
            for (Seat seat : row) {
                if (seat.getSeatNumber().equals(seatToCancel)) {
                    if (seat.cancelReservation()) {
                        System.out.println("✅ Reservation for seat [" + seatToCancel + "] has been canceled.");
                    }
                    return;
                }
            }
        }
        System.out.println("❌ No reservation found for [" + seatToCancel + "]");
    }

    /**
     * Prints the seating arrangement, showing available and reserved seats.
     */
    public static void printSeats() {
        System.out.println("\n🎭 Seating Arrangement:");
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                System.out.print(seat.isAvailable() ? "[" + seat.getSeatNumber() + "] " : "[🔴] ");
            }
            System.out.println();
        }
    }

    /**
     * Displays the pricing information for each seat.
     */
    public static void showSeatPricing() {
        System.out.println("\n💲 Seat Pricing Map:");
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                System.out.printf("[$%-6.2f] ", seat.getPrice());
            }
            System.out.println();
        }
    }
}