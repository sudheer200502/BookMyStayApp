/**
 * ================================================================
 * MAIN CLASS - UseCase11ConcurrencySetup
 * ================================================================
 *
 * Use Case 11: Concurrent Booking Simulation
 *
 * Description:
 * Simulates multiple users booking rooms at the same time.
 *
 * @version 4.0
 */
public class UC11 {

    public static void main(String[] args) {

        // Step 1: Setup inventory (only 1 room for testing)
        RoomInventory inventory = new RoomInventory();
        inventory.updateAvailability("Suite", 1);

        BookingManager bookingManager = new BookingManager(inventory);

        // Step 2: Create multiple threads (users)
        Thread user1 = new Thread(new BookingTask(bookingManager, "Suite"), "User-1");
        Thread user2 = new Thread(new BookingTask(bookingManager, "Suite"), "User-2");
        Thread user3 = new Thread(new BookingTask(bookingManager, "Suite"), "User-3");

        // Step 3: Start threads
        user1.start();
        user2.start();
        user3.start();

        // Step 4: Wait for all threads to finish
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Step 5: Final availability
        System.out.println("\nFinal Availability:");
        System.out.println(inventory.getRoomAvailability());
    }
}