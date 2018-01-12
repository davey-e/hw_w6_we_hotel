package Hotel.Room;

public class Bedroom extends Room{

    private int roomNumber;

    public Bedroom(int capacity, int roomNumber){
        super(capacity);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
