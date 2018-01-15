package Hotel.Room;

import Hotel.Enum.RoomType;

public class ConferenceRoom extends Room{

    private String roomName;
    private double rate;

    public ConferenceRoom(int capacity, RoomType roomType, String roomName, double rate){
        super(capacity, roomType);
        this.roomName = roomName;
        this.rate = rate;

    }
    public String getRoomName() {
        return this.roomName;
    }

    public double getRate() {
        return this.rate;
    }
}
