import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * CLASS - BookingHistory
 * ================================================================
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * Stores all booking records and generates reports.
 *
 * @version 3.1
 */
public class BookingHistory {

    private List<BookingRecord> records;

    public BookingHistory() {
        records = new ArrayList<>();
    }

    /**
     * Add booking record
     */
    public void addRecord(BookingRecord record) {
        records.add(record);
    }

    /**
     * Display all bookings
     */
    public void showAllBookings() {
        System.out.println("\nBooking History:");
        for (BookingRecord r : records) {
            System.out.println(r);
        }
    }

    /**
     * Generate total revenue report
     */
    public void generateRevenueReport() {
        double total = 0;
        for (BookingRecord r : records) {
            total += r.getAmount();
        }

        System.out.println("\nTotal Revenue: Rs. " + total);
    }

    /**
     * Filter bookings by room type
     */
    public void filterByRoomType(String roomType) {
        System.out.println("\nBookings for " + roomType + ":");

        for (BookingRecord r : records) {
            if (r.getRoomType().equalsIgnoreCase(roomType)) {
                System.out.println(r);
            }
        }
    }
}
