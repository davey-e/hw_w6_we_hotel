import Hotel.Enum.BedroomType;
import Hotel.Enum.RoomType;
import Hotel.Hotel;
import Hotel.Room.Bedroom;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.DiningRoom;
import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ArrayList<Bedroom> bedrooms;
    ArrayList<Bedroom> vacantBedrooms;
    ConferenceRoom conferenceRoom1;
    ArrayList<ConferenceRoom> conferenceRooms;
    DiningRoom diningRoom1;
    ArrayList<DiningRoom> diningRooms;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests1;
    ArrayList<Guest> guests2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.BEDROOM, 1, BedroomType.SINGLE, 50.00);
        bedroom2 = new Bedroom(RoomType.BEDROOM, 2, BedroomType.DOUBLE, 80.00);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        vacantBedrooms = new ArrayList<>();
        vacantBedrooms.add(bedroom2);
        conferenceRoom1 = new ConferenceRoom(20, RoomType.CONFERENCEROOM,"Lomond", 2000.00);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom1);
        diningRoom1 = new DiningRoom(50, RoomType.DININGROOM,"Dining Room 1");
        diningRooms = new ArrayList<>();
        diningRooms.add(diningRoom1);
        guest1 = new Guest("Joe Bloggs", 100.0);
        guest2 = new Guest("Jane Bloggs", 60.00);
        guests1 = new ArrayList<>();
        guests1.add(guest1);
        guests2 = new ArrayList<>();
        guests2.add(guest1);
        guests2.add(guest2);
        hotel = new Hotel("Faulty Towers", bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void hasName(){
        assertEquals("Faulty Towers", hotel.getName());
    }

    @Test
    public void hasBedroomsArrayList(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void hasConferenceRoomsArrayList(){
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }

    @Test
    public void hasDiningRoomsArrayList(){
        assertEquals(diningRooms, hotel.getDiningRooms());
    }

    @Test
    public void canGetNumberOfBedrooms(){
        assertEquals(2, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canGetNumberOfConferenceRooms(){
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canGetNumberOfDiningRooms(){
        assertEquals(1, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void canCheckGuestsIntoBedroom(){
        hotel.checkGuestsIntoBedroom(bedroom1, guests1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canCheckGuestsIntoConferenceRoom(){
        hotel.checkGuestsIntoConferenceRoom(conferenceRoom1, guests2);
        assertEquals(2, conferenceRoom1.getNumberOfGuests());
    }

    @Test
    public void canCheckGuestIntoDiningRoom(){
        hotel.checkGuestIntoDiningRoom(diningRoom1, guest1);
        assertEquals(1, diningRoom1.getNumberOfGuests());
    }

    @Test
    public void canCheckGuestsOutOfBedroom(){
        hotel.checkGuestsIntoBedroom(bedroom2, guests2);
        hotel.checkGuestsOutOfBedroom(bedroom2);
        assertEquals(0, bedroom2.getNumberOfGuests());
    }

    @Test
    public void canCheckGuestsOutOfConferenceRoom(){
        hotel.checkGuestsIntoConferenceRoom(conferenceRoom1, guests2);
        hotel.checkGuestsOutOfConferenceRoom(conferenceRoom1);
        assertEquals(0, conferenceRoom1.getNumberOfGuests());
    }

    @Test
    public void canCheckGuestOutOfDiningRoom(){
        hotel.checkGuestIntoDiningRoom(diningRoom1, guest1);
        hotel.checkGuestIntoDiningRoom(diningRoom1, guest2);
        hotel.checkGuestOutOfDiningRoom(diningRoom1, guest1);
        assertEquals(1, diningRoom1.getNumberOfGuests());
    }

    @Test
    public void canListVacantBedrooms(){
        hotel.checkGuestsIntoBedroom(bedroom1, guests1);
        assertEquals(vacantBedrooms, hotel.listVacantBedrooms());
    }

}
