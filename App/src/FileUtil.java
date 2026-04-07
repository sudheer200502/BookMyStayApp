import java.io.*;
import java.util.*;

/**
 * ================================================================
 * CLASS - FileUtil
 * ================================================================
 *
 * Use Case 12: Data Persistence
 *
 * Description:
 * Handles saving and loading data from files.
 *
 * @version 4.0
 */
public class FileUtil {

    /**
     * Save room inventory to file
     */
    public static void saveInventory(Map<String, Integer> data, String fileName) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(data);
            System.out.println("Inventory saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving inventory: " + e.getMessage());
        }
    }

    /**
     * Load room inventory from file
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Integer> loadInventory(String fileName) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            return (Map<String, Integer>) ois.readObject();

        } catch (Exception e) {
            System.out.println("No previous data found. Initializing new inventory.");
            return new HashMap<>();
        }
    }

    /**
     * Save booking history
     */
    public static void saveHistory(List<BookingRecord> records, String fileName) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(records);
            System.out.println("History saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving history: " + e.getMessage());
        }
    }

    /**
     * Load booking history
     */
    @SuppressWarnings("unchecked")
    public static List<BookingRecord> loadHistory(String fileName) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            return (List<BookingRecord>) ois.readObject();

        } catch (Exception e) {
            System.out.println("No previous history found.");
            return new ArrayList<>();
        }
    }
}