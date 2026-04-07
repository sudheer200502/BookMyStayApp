/**
 * ================================================================
 * CLASS - Service
 * ================================================================
 *
 * Represents an add-on service like food, WiFi, etc.
 *
 * @version 3.1
 */
public class Service {

    private String name;
    private double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (Rs. " + price + ")";
    }
}