/**
 * Seat Class
 * Represents a seat in the TicketMaster system.
 */
class Seat {
    private final String seatNumber;
    private final double price;
    private boolean reserved;

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        this.reserved = false;
    }

    /**
     * Attempts to reserve the seat. If already reserved, prints an error message.
     * @return true if reservation is successful, false otherwise.
     */
    public boolean reserve() {
        if (!reserved) {
            reserved = true;
            return true;
        }
        System.out.println("❌ Seat [" + seatNumber + "] is already reserved.");
        return false;
    }

    /**
     * Attempts to cancel a reservation. If not reserved, prints an error message.
     * @return true if cancellation is successful, false otherwise.
     */
    public boolean cancelReservation() {
        if (reserved) {
            reserved = false;
            return true;
        }
        System.out.println("❌ Seat [" + seatNumber + "] is not reserved.");
        return false;
    }

    /**
     * Checks if the seat is available for reservation.
     * @return true if the seat is available, false otherwise.
     */
    public boolean isAvailable() {
        return !reserved;
    }

    /**
     * Gets the seat number.
     * @return seat number as a string.
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Gets the price of the seat.
     * @return price of the seat.
     */
    public double getPrice() {
        return price;
    }
}