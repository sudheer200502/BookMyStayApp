import java.util.List;

/**
 * ================================================================
 * CLASS - CancellationService
 * ================================================================
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * Handles booking cancellation and restores inventory.
 *
 * @version 3.1
 */
public class CancellationService {

    private BookingManager bookingManager;
    private BookingHistory history;

    public CancellationService(BookingManager bookingManager, BookingHistory history) {
        this.bookingManager = bookingManager;
        this.history = history;
    }

    /**
     * Cancel booking and rollback inventory
     */
    public void cancelBooking(String roomType, double amount, String date) {

        // Step 1: Restore inventory
        bookingManager.cancelBooking(roomType);

        // Step 2: Add cancellation record (negative amount)
        BookingRecord cancelRecord =
                new BookingRecord(roomType, -amount, date);

        history.addRecord(cancelRecord);

        System.out.println("Booking cancelled for " + roomType + " room.");
        System.out.println("Amount refunded: Rs. " + amount);
    }
}