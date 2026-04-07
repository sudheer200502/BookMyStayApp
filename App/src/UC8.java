/**
 * ================================================================
 * MAIN CLASS - UseCase8HistorySetup
 * ================================================================
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * Demonstrates storing bookings and generating reports.
 *
 * @version 3.1
 */
public class UC8 {

    public static void main(String[] args) {

        // Step 1: Create history manager
        BookingHistory history = new BookingHistory();

        // Step 2: Add sample records
        history.addRecord(new BookingRecord("Single", 2000, "2026-04-01"));
        history.addRecord(new BookingRecord("Deluxe", 5000, "2026-04-02"));
        history.addRecord(new BookingRecord("Suite", 8000, "2026-04-03"));
        history.addRecord(new BookingRecord("Single", 2000, "2026-04-04"));

        // Step 3: Show all bookings
        history.showAllBookings();

        // Step 4: Revenue report
        history.generateRevenueReport();

        // Step 5: Filter report
        history.filterByRoomType("Single");
    }
}