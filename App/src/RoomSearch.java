import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ================================================================
 * CLASS - RoomSearch
 * ================================================================
 *
 * Use Case 5: Room Search & Viewing
 *
 * Description:
 * Allows users to search available rooms
 * and view details like price and features.
 *
 * Combines RoomInventory + Room data.
 *
 * @version 3.1
 */
public class RoomSearch {

    private RoomInventory inventory;
    private List<Room> rooms;

    public RoomSearch(RoomInventory inventory) {
        this.inventory = inventory;
        this.rooms = new ArrayList<>();
        initializeRooms();
    }

    /**
     * Initialize room details
     */
    private void initializeRooms() {
        rooms.add(new Room("Single", 2000, "1 Bed, AC"));
        rooms.add(new Room("Double", 3500, "2 Beds, AC"));
        rooms.add(new Room("Deluxe", 5000, "King Bed, AC, TV"));
        rooms.add(new Room("Suite", 8000, "Luxury Suite, AC, TV, WiFi"));
    }

    /**
     * Display available rooms with details
     */
    public void searchAvailableRooms() {
        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("\nAvailable Rooms:");

        for (Room room : rooms) {
            String type = room.getType();

            if (availability.containsKey(type) && availability.get(type) > 0) {
                System.out.println(room + " | Available: " + availability.get(type));
            }
        }
    }
}{
}
