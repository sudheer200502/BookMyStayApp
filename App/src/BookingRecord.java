/**
 * ================================================================
 * CLASS - BookingRecord
 * ================================================================
 *
 * Represents a single booking entry.
 *
 * @version 3.1
 */
public class BookingRecord {

    private String roomType;
    private double amount;
    private String date;

    public BookingRecord(String roomType, double amount, String date) {
        this.roomType = roomType;
        this.amount = amount;
        this.date = date;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Room: " + roomType +
                ", Amount: Rs. " + amount +
                ", Date: " + date;
    }
}
