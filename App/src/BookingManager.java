import java.util.HashMap;
import java.util.Map;

/**
 * ================================================================
 * CLASS - BookingManager
 * ================================================================
 *
 * Use Case 4: Room Booking Management
 *
 * Description:
 * This class handles booking and cancellation of rooms.
 * It interacts with RoomInventory to update availability.
 *
 * Ensures that bookings are only made when rooms are available.
 *
 * @version 3.1
 */
public class BookingManager {

    private RoomInventory inventory;

    /**
     * Constructor initializes with RoomInventory
     */
    public BookingManager(RoomInventory inventory) {
        this.inventory = inventory;
    }

    /**
     * Books a room if available
     *
     * @param roomType type of room
     * @return true if booking successful, else false
     */
    public boolean bookRoom(String roomType) {
        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.containsKey(roomType) && availability.get(roomType) > 0) {
            availability.put(roomType, availability.get(roomType) - 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cancels a booking (increases availability)
     *
     * @param roomType type of room
     */
    public void cancelBooking(String roomType) {
        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.containsKey(roomType)) {
            availability.put(roomType, availability.get(roomType) + 1);
        }
    }
}