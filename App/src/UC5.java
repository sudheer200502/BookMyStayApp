/**
 * ================================================================
 * MAIN CLASS - UseCase5SearchSetup
 * ================================================================
 *
 * Use Case 5: Room Search & Viewing
 *
 * Description:
 * Demonstrates searching and displaying available rooms.
 *
 * @version 3.1
 */
public class UC5 {

    public static void main(String[] args) {

        // Step 1: Create inventory
        RoomInventory inventory = new RoomInventory();

        // Step 2: Create search system
        RoomSearch search = new RoomSearch(inventory);

        // Step 3: Show available rooms
        search.searchAvailableRooms();
    }
}