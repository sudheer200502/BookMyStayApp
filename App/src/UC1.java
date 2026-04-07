/**
 * ================================================================
 * CLASS - MainApp
 * ================================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * Entry point of the Hotel Management System.
 * Displays welcome message and basic menu.
 *
 * @version 1.0
 */
public class UC1 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   WELCOME TO HOTEL MANAGEMENT SYSTEM");
        System.out.println("=====================================");

        System.out.println("\nAvailable Modules:");
        System.out.println("1. Room Inventory");
        System.out.println("2. Booking");
        System.out.println("3. Search Rooms");
        System.out.println("4. Payment");
        System.out.println("5. Add-On Services");
        System.out.println("6. Booking History");
        System.out.println("7. Cancellation");
        System.out.println("8. Reports");
        System.out.println("9. Exit");

        System.out.println("\nSystem Initialized Successfully!");
    }
}