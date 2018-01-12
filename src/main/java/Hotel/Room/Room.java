package Hotel.Room;
import Hotel.Guest;

import java.util.ArrayList;


public class Room {

    private int capacity;
    private ArrayList<Guest> guests;


    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();

    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }
}
