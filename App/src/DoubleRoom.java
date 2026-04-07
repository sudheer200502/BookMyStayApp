public class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 350, 120.0);
    }

    @Override
    public void displayDetails() {
        System.out.println("Double Room:");
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sq ft");
        System.out.println("Price: $" + pricePerNight + " per night");
    }
}