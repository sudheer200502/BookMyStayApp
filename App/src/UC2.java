public class UC2 {
    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();

        single.displayDetails();
        System.out.println("-------------------");
        doubleRoom.displayDetails();
    }
}