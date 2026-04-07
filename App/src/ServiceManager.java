import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * CLASS - ServiceManager
 * ================================================================
 *
 * Use Case 7: Add-On Service Selection
 *
 * Description:
 * Manages available services and selected services.
 *
 * @version 3.1
 */
public class ServiceManager {

    private List<Service> availableServices;
    private List<Service> selectedServices;

    public ServiceManager() {
        availableServices = new ArrayList<>();
        selectedServices = new ArrayList<>();
        initializeServices();
    }

    /**
     * Initialize available services
     */
    private void initializeServices() {
        availableServices.add(new Service("Breakfast", 500));
        availableServices.add(new Service("WiFi", 300));
        availableServices.add(new Service("Airport Pickup", 1000));
        availableServices.add(new Service("Extra Bed", 700));
    }

    /**
     * Display available services
     */
    public void showServices() {
        System.out.println("\nAvailable Add-On Services:");
        for (Service s : availableServices) {
            System.out.println("- " + s);
        }
    }

    /**
     * Select a service
     */
    public void selectService(String serviceName) {
        for (Service s : availableServices) {
            if (s.getName().equalsIgnoreCase(serviceName)) {
                selectedServices.add(s);
                System.out.println(serviceName + " added.");
                return;
            }
        }
        System.out.println("Service not found!");
    }

    /**
     * Get total cost of selected services
     */
    public double getTotalServiceCost() {
        double total = 0;
        for (Service s : selectedServices) {
            total += s.getPrice();
        }
        return total;
    }

    /**
     * Display selected services
     */
    public void showSelectedServices() {
        System.out.println("\nSelected Services:");
        for (Service s : selectedServices) {
            System.out.println("- " + s);
        }
        System.out.println("Total Service Cost: Rs. " + getTotalServiceCost());
    }
}