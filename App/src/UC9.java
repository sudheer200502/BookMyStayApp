/**
 * ================================================================
 * MAIN CLASS - UseCase9ValidationSetup
 * ================================================================
 *
 * Use Case 9: Error Handling & Validation
 *
 * Description:
 * Demonstrates validation and exception handling.
 *
 * @version 3.1
 */
public class UC9 {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        BookingManager bookingManager = new BookingManager(inventory);
        BookingService bookingService = new BookingService(bookingManager);

        // Valid booking
        bookingService.bookWithPayment("Single", 2000);

        // Invalid room type
        bookingService.bookWithPayment("King", 3000);

        // Invalid amount
        bookingService.bookWithPayment("Deluxe", -500);
    }
}