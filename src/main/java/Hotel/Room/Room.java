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
        return this.capacity;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void addGuestToGuestsArrayList(Guest guest){
        this.guests.add(guest);
    }

    public void checkInMultipleGuests(ArrayList<Guest> guestsToCheckIn) {
        int numberOfGuestsToCheckIn = guestsToCheckIn.size();
        if (getNumberOfGuests() == 0){
            if (numberOfGuestsToCheckIn <= getCapacity()){
                for (int i = 0; i < numberOfGuestsToCheckIn; i++){
                    addGuestToGuestsArrayList(guestsToCheckIn.get(i));
                }
            }
        }
    }
}
