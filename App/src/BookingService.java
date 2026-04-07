/**
 * ================================================================
 * CLASS - BookingService
 * ================================================================
 *
 * Use Case 6: Booking with Payment Confirmation
 *
 * Description:
 * Combines BookingManager + Payment.
 * Booking is confirmed only after successful payment.
 *
 * @version 3.1
 */
public class BookingService {

    private BookingManager bookingManager;
    private Payment payment;

    public BookingService(BookingManager bookingManager) {
        this.bookingManager = bookingManager;
        this.payment = new Payment();
    }

    /**
     * Book room with payment
     *
     * @param roomType room type
     * @param price room price
     */
    public void bookWithPayment(String roomType, double price) {

        // Step 1: Try booking
        boolean isBooked = bookingManager.bookRoom(roomType);

        if (!isBooked) {
            System.out.println("Booking Failed! Room not available.");
            return;
        }

        // Step 2: Process payment
        boolean isPaid = payment.processPayment(price);

        if (isPaid) {
            System.out.println("Booking Confirmed for " + roomType + " room.");
        } else {
            System.out.println("Payment Failed! Cancelling booking...");
            bookingManager.cancelBooking(roomType);
        }
    }
}