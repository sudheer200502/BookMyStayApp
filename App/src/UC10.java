/**
 * ================================================================
 * MAIN CLASS - UseCase10CancellationSetup
 * ================================================================
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * Demonstrates cancellation and refund logic.
 *
 * @version 3.1
 */
public class UC10 {

    public static void main(String[] args) {

        // Step 1: Setup
        RoomInventory inventory = new RoomInventory();
        BookingManager bookingManager = new BookingManager(inventory);
        BookingHistory history = new BookingHistory();

        // Step 2: Simulate booking
        bookingManager.bookRoom("Deluxe");
        history.addRecord(new BookingRecord("Deluxe", 5000, "2026-04-07"));

        System.out.println("Before Cancellation:");
        System.out.println(inventory.getRoomAvailability());

        // Step 3: Cancel booking
        CancellationService cancelService =
                new CancellationService(bookingManager, history);

        cancelService.cancelBooking("Deluxe", 5000, "2026-04-07");

        // Step 4: After cancellation
        System.out.println("\nAfter Cancellation:");
        System.out.println(inventory.getRoomAvailability());

        // Step 5: Show history
        history.showAllBookings();

        // Step 6: Net revenue
        history.generateNetRevenueReport();
    }
}