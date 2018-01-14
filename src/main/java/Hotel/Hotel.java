package Hotel;

import Hotel.Room.Bedroom;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.DiningRoom;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DiningRoom> diningRooms){
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return this.conferenceRooms;
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return this.diningRooms;
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public int getNumberOfDiningRooms() {
        return this.diningRooms.size();
    }

    public void checkGuestsIntoBedroom(Bedroom bedroom, ArrayList<Guest> guests){
        if(bedroom.roomExistsInHotel(this)){
            bedroom.checkInMultipleGuests(guests);
        }
    }

    public void checkGuestsIntoConferenceRoom(ConferenceRoom conferenceRoom, ArrayList<Guest> guests){
        if(conferenceRoom.roomExistsInHotel(this)){
            conferenceRoom.checkInMultipleGuests(guests);
        }
    }

    public void checkGuestIntoDiningRoom(DiningRoom diningRoom, Guest guest){
        if(diningRoom.roomExistsInHotel(this)){
            diningRoom.checkInSingleGuest(guest);
        }
    }

}
