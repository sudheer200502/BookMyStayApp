/**
 * ================================================================
 * MAIN CLASS - UseCase7ServiceSetup
 * ================================================================
 *
 * Use Case 7: Add-On Service Selection
 *
 * Description:
 * Demonstrates selecting extra services and calculating cost.
 *
 * @version 3.1
 */
public class UC7 {

    public static void main(String[] args) {

        // Step 1: Create service manager
        ServiceManager serviceManager = new ServiceManager();

        // Step 2: Show available services
        serviceManager.showServices();

        // Step 3: Select services
        serviceManager.selectService("Breakfast");
        serviceManager.selectService("WiFi");

        // Step 4: Show selected services
        serviceManager.showSelectedServices();
    }
}