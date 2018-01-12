package Hotel.Room;

import Hotel.Enum.RoomType;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType){
        super(roomType.getOccupancy());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
