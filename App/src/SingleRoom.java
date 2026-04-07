public class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 200, 80.0);
    }

    @Override
    public void displayDetails() {
        System.out.println("Single Room:");
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sq ft");
        System.out.println("Price: $" + pricePerNight + " per night");
    }
}