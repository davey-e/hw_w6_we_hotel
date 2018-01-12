package Hotel.Room;

import Hotel.Enum.RoomType;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private double rate;

    public Bedroom(int roomNumber, RoomType roomType, double rate){
        super(roomType.getOccupancy());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getRate() {
        return rate;
    }
}
