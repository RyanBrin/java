/**
 * Section class representing a seating section in the TicketMaster system.
 */
class Section {
    private final String name;
    private final Seat[][] seats;
    private final double price;

    /**
     * Constructor for a Section.
     * @param name The name of the section.
     * @param rows The number of rows in the section.
     * @param cols The number of columns in the section.
     * @param price The price of each seat in this section.
     */
    public Section(String name, int rows, int cols, double price) {
        this.name = name;
        seats = new Seat[rows][cols];
        this.price = price;
        initializeSeats();
    }

    /**
     * Initializes all seats within the section with unique seat numbers.
     */
    private void initializeSeats() {
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                String seatNumber = (char) ('A' + row) + Integer.toString(col + 1);
                seats[row][col] = new Seat(seatNumber, price);
            }
        }
    }

    /**
     * Reserves a seat for a given customer name.
     * @param seatNumber The seat number to reserve.
     * @param name The name of the customer reserving the seat.
     * @return true if the reservation is successful, false if the seat is unavailable.
     */
    public boolean reserveSeat(String seatNumber, String name) {
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                if (seat.getSeatNumber().equals(seatNumber) && seat.isAvailable()) {
                    seat.reserve(name);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Cancels a reservation for a specific seat.
     * @param seatNumber The seat number to cancel the reservation for.
     * @return true if cancellation is successful, false if no reservation exists.
     */
    public boolean cancelReservation(String seatNumber) {
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                if (seat.getSeatNumber().equals(seatNumber) && !seat.isAvailable()) {
                    seat.cancelReservation();
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Prints the seating arrangement of the section, indicating available and reserved seats.
     */
    public void printSeats() {
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                System.out.print(seat.isAvailable() ? "[ " + seat.getSeatNumber() + " ] " : "[ 🔴 ] ");
            }
            System.out.println();
        }
    }

    /**
     * Displays seat pricing for the section.
     */
    public void showPricing() {
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                System.out.printf("[$%-6.2f] ", seat.getPrice());
            }
            System.out.println();
        }
    }

    /**
     * Gets the name of the section.
     * @return The section name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of a seat in the section.
     * @return The seat price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Cancels all seat reservations made by a customer.
     */
    public void cancelMultipleReservations(String name) {
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                if (!seat.isAvailable() && seat.getReservedBy().equals(name)) {
                    seat.cancelReservation();
                }
            }
        }
    }
}