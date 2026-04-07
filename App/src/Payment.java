/**
 * ================================================================
 * CLASS - Payment
 * ================================================================
 *
 * Use Case 6: Payment Processing
 *
 * Description:
 * Handles payment simulation for room booking.
 *
 * @version 3.1
 */
public class Payment {

    /**
     * Simulates payment processing
     *
     * @param amount amount to be paid
     * @return true if payment successful
     */
    public boolean processPayment(double amount) {

        System.out.println("Processing payment of Rs. " + amount + "...");

        // Simulate successful payment
        System.out.println("Payment Successful!");

        return true;
    }
}