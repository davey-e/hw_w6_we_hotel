package Hotel.Room;

public class ConferenceRoom extends Room{

    private String roomName;
    private double rate;

    public ConferenceRoom(int capacity, String roomName, double rate){
        super(capacity);
        this.roomName = roomName;
        this.rate = rate;

    }
    public String getRoomName() {
        return roomName;
    }

    public double getRate() {
        return rate;
    }
}
