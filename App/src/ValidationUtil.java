/**
 * ================================================================
 * CLASS - ValidationUtil
 * ================================================================
 *
 * Use Case 9: Error Handling & Validation
 *
 * Description:
 * Provides validation methods for inputs.
 *
 * @version 3.1
 */
public class ValidationUtil {

    /**
     * Validate room type
     */
    public static boolean isValidRoomType(String roomType) {
        return roomType != null &&
                (roomType.equalsIgnoreCase("Single") ||
                        roomType.equalsIgnoreCase("Double") ||
                        roomType.equalsIgnoreCase("Deluxe") ||
                        roomType.equalsIgnoreCase("Suite"));
    }

    /**
     * Validate amount
     */
    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    /**
     * Validate service name
     */
    public static boolean isValidService(String serviceName) {
        return serviceName != null && !serviceName.trim().isEmpty();
    }
}