package Hotel.Room;

public class DiningRoom extends Room{

    String roomName;

    public DiningRoom(int capacity, String roomName){
        super(capacity);
        this.roomName = roomName;

    }


    public String getRoomName() {
        return roomName;
    }
}
