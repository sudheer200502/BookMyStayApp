
/**
 * ================================================================
 * MAIN CLASS - UseCase4BookingSetup
 * ================================================================
 *
 * Use Case 4: Room Booking Management
 *
 * Description:
 * Demonstrates booking and cancellation using centralized inventory.
 *
 * @version 3.1
 */
public class UC4 {

    public static void main(String[] args) {

        // Step 1: Create inventory
        RoomInventory inventory = new RoomInventory();

        // Step 2: Create booking manager
        BookingManager bookingManager = new BookingManager(inventory);

        // Step 3: Show initial availability
        System.out.println("Initial Availability:");
        System.out.println(inventory.getRoomAvailability());

        // Step 4: Book rooms
        System.out.println("\nBooking Single Room...");
        boolean booked1 = bookingManager.bookRoom("Single");
        System.out.println("Booking Success: " + booked1);

        System.out.println("Booking Suite Room...");
        boolean booked2 = bookingManager.bookRoom("Suite");
        System.out.println("Booking Success: " + booked2);

        // Step 5: Show updated availability
        System.out.println("\nAvailability After Booking:");
        System.out.println(inventory.getRoomAvailability());

        // Step 6: Cancel booking
        System.out.println("\nCancelling Single Room...");
        bookingManager.cancelBooking("Single");

        // Step 7: Final availability
        System.out.println("\nFinal Availability:");
        System.out.println(inventory.getRoomAvailability());
    }
}