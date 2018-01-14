package Hotel.Room;
import Hotel.Enum.RoomType;
import Hotel.Guest;

import java.util.ArrayList;


public class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private RoomType roomType;


    public Room(int capacity, RoomType roomType){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.roomType = roomType;

    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public void addGuestToGuestsArrayList(Guest guest){
        this.guests.add(guest);
    }

    public void checkInSingleGuest(Guest guestToCheckIn){
        if (getNumberOfGuests() +1 <= getCapacity()){
            addGuestToGuestsArrayList(guestToCheckIn);
        }
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
