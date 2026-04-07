/**
 * ================================================================
 * CLASS - BookingTask (Thread)
 * ================================================================
 *
 * Represents a user trying to book a room.
 *
 * @version 4.0
 */
public class BookingTask implements Runnable {

    private BookingManager bookingManager;
    private String roomType;

    public BookingTask(BookingManager bookingManager, String roomType) {
        this.bookingManager = bookingManager;
        this.roomType = roomType;
    }

    @Override
    public void run() {
        bookingManager.bookRoom(roomType);
    }
}