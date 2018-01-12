package Hotel.Rooms;
import Hotel.Guest;

import java.util.ArrayList;


public class Room {

    int capacity;
    ArrayList<Guest> guests;


    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();

    }

    public int getCapacity() {
        return capacity;
    }
}
