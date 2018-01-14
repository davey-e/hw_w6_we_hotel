package Hotel.Enum;

public enum BedroomType {

    SINGLE(1),
    DOUBLE(2),
    FAMILY(4);

    private final int occupancy;

    BedroomType(int occupancy){
        this.occupancy = occupancy;
    }

    public int getOccupancy(){
        return occupancy;
    }

}
