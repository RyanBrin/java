/**
 * Seat class representing an individual seat in the TicketMaster system.
 */
class Seat {
    private final String seatNumber;
    private final double price;
    private String reservedBy;

    /**
     * Constructor for a Seat.
     * @param seatNumber The seat's unique identifier.
     * @param price The price of the seat.
     */
    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        this.reservedBy = null;
    }

    /**
     * Reserves the seat for a specific customer.
     * @param name The name of the customer reserving the seat.
     */
    public void reserve(String name) {
        reservedBy = name;
    }

    /**
     * Cancels the reservation for this seat.
     */
    public void cancelReservation() {
        reservedBy = null;
    }

    /**
     * Checks if the seat is available.
     * @return true if the seat is not reserved, false otherwise.
     */
    public boolean isAvailable() {
        return reservedBy == null;
    }

    /**
     * Gets the seat number.
     * @return The seat's identifier.
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Gets the price of the seat.
     * @return The price of the seat.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the name of the customer currently reserving the seat.
     * @return The name of the customer reserving the seat, or null if no one is reserved.
     */
    public String getReservedBy() {
        return reservedBy;
    }
}