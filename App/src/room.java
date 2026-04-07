/**
 * =========================================================
 * ABSTRACT CLASS - Room
 * =========================================================
 *
 * Description:
 * This abstract class represents a generic hotel room.
 * It models attributes intrinsic to a room type and
 * excludes availability concerns.
 *
 * @version 2.1
 */
public abstract class Room {

    /** Number of beds available in the room. */
    protected int numberOfBeds;

    /** Total size of the room in square feet. */
    protected int squareFeet;

    /** Price charged per night for this room type. */
    protected double pricePerNight;

    /**
     * Constructor used by child classes to initialize attributes.
     *
     * @param numberOfBeds number of beds in the room
     * @param squareFeet total room size
     * @param pricePerNight cost per night
     */
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    /** Abstract method to display room details. */
    public abstract void displayDetails();
}