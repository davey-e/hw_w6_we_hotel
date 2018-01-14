package Hotel.Room;

import Hotel.Enum.BedroomType;

public class Bedroom extends Room{

    private int roomNumber;
    private BedroomType bedroomType;
    private double rate;

    public Bedroom(int roomNumber, BedroomType bedroomType, double rate){
        super(bedroomType.getOccupancy());
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public double getRate() {
        return rate;
    }
}
