/**
 * ================================================================
 * MAIN CLASS - UseCase3InventorySetup
 * ================================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class demonstrates how room availability
 * is managed using a centralized inventory.
 *
 * Room objects are used to retrieve pricing
 * and room characteristics.
 *
 * No booking or search logic is introduced here.
 *
 * @version 3.1
 */
public class UC3 {

    /**
     * Application entry point.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Create inventory object
        RoomInventory inventory = new RoomInventory();

        // Display initial availability
        System.out.println("Initial Room Availability:");
        System.out.println(inventory.getRoomAvailability());

        // Update availability
        inventory.updateAvailability("Single", 7);
        inventory.updateAvailability("Suite", 1);

        // Display updated availability
        System.out.println("\nUpdated Room Availability:");
        System.out.println(inventory.getRoomAvailability());
    }
}