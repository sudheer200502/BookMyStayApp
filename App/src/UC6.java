/**
 * ================================================================
 * MAIN CLASS - UseCase6PaymentSetup
 * ================================================================
 *
 * Use Case 6: Payment & Booking Confirmation
 *
 * Description:
 * Demonstrates booking with payment confirmation.
 *
 * @version 3.1
 */
public class UC6 {

    public static void main(String[] args) {

        // Step 1: Inventory
        RoomInventory inventory = new RoomInventory();

        // Step 2: Booking Manager
        BookingManager bookingManager = new BookingManager(inventory);

        // Step 3: Booking Service (with payment)
        BookingService bookingService = new BookingService(bookingManager);

        // Step 4: Book with payment
        bookingService.bookWithPayment("Deluxe", 5000);

        // Step 5: Show updated availability
        System.out.println("\nUpdated Availability:");
        System.out.println(inventory.getRoomAvailability());
    }
}