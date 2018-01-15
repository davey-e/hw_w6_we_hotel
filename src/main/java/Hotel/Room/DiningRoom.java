package Hotel.Room;

import Hotel.Enum.RoomType;

public class DiningRoom extends Room{

    String roomName;

    public DiningRoom(int capacity, RoomType roomType, String roomName){
        super(capacity, roomType);
        this.roomName = roomName;

    }


    public String getRoomName() {
        return this.roomName;
    }
}
