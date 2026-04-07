/**
 * ================================================================
 * MAIN CLASS - UseCase12PersistenceSetup
 * ================================================================
 *
 * Use Case 12: Data Persistence & System Recovery
 *
 * Description:
 * Demonstrates saving and restoring system state.
 *
 * @version 4.0
 */
public class UC12 {

    public static void main(String[] args) {

        String inventoryFile = "inventory.dat";
        String historyFile = "history.dat";

        // Step 1: Initialize
        RoomInventory inventory = new RoomInventory();
        BookingHistory history = new BookingHistory();

        // Step 2: Load previous data (if exists)
        inventory.loadFromFile(inventoryFile);
        history.loadFromFile(historyFile);

        System.out.println("Loaded Inventory:");
        System.out.println(inventory.getRoomAvailability());

        // Step 3: Simulate booking
        BookingManager manager = new BookingManager(inventory);
        manager.bookRoom("Single");
        history.addRecord(new BookingRecord("Single", 2000, "2026-04-07"));

        // Step 4: Save current state
        inventory.saveToFile(inventoryFile);
        history.saveToFile(historyFile);

        System.out.println("\nData saved. Restart program to see recovery.");
    }
}