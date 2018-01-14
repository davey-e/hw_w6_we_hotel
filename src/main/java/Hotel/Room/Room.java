package Hotel.Room;
import Hotel.Enum.RoomType;
import Hotel.Guest;
import Hotel.Hotel;

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

    public ArrayList<Guest> getGuests(){
        return this.guests;
    }

    public void addGuestToGuestsArrayList(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuestFromGuestsArrayList(Guest guest) {
        this.guests.remove(guest);
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

    public boolean roomExistsInHotel(Hotel hotel){
        int numberOfRooms;
        boolean roomFound = false;
        switch(this.roomType) {
            case BEDROOM:
                numberOfRooms = hotel.getNumberOfBedrooms();
                for (int i = 0; i < numberOfRooms; i++) {
                    if (hotel.getBedrooms().get(i) == this) {
                        roomFound = true;
                    }
                }
                break;
            case CONFERENCEROOM:
                numberOfRooms = hotel.getNumberOfConferenceRooms();
                for (int i = 0; i < numberOfRooms; i++) {
                    if (hotel.getConferenceRooms().get(i) == this) {
                        roomFound = true;
                    }
                }
                break;
            case DININGROOM:
                numberOfRooms = hotel.getNumberOfDiningRooms();
                for (int i = 0; i < numberOfRooms; i++) {
                    if (hotel.getDiningRooms().get(i) == this) {
                        roomFound = true;
                    }
                }
                break;
        }
        return roomFound;
    }

}
