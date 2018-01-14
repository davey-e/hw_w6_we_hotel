import Hotel.Enum.BedroomType;
import Hotel.Enum.RoomType;
import Hotel.Guest;
import Hotel.Hotel;
import Hotel.Room.Bedroom;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.DiningRoom;
import Hotel.Room.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoomTest {

    Room room;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ArrayList<Bedroom> bedrooms;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<ConferenceRoom> conferenceRooms;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    ArrayList<DiningRoom> diningRooms;
    Hotel hotel;
    ArrayList<Guest> guests1;
    ArrayList<Guest> guests2;

    @Before
    public void before(){
        room = new Room(1, RoomType.BEDROOM);
        bedroom1 = new Bedroom(RoomType.BEDROOM, 1, BedroomType.SINGLE, 50.00);
        bedroom2 = new Bedroom(RoomType.BEDROOM, 2, BedroomType.DOUBLE, 100.00);
        bedroom3 = new Bedroom(RoomType.BEDROOM, 3, BedroomType.FAMILY, 150.00);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRoom1 = new ConferenceRoom(20, RoomType.CONFERENCEROOM,"Lomond", 2000.00);
        conferenceRoom2 = new ConferenceRoom(10, RoomType.CONFERENCEROOM, "Ness", 1500.00);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom1);
        diningRoom1 = new DiningRoom(10, RoomType.DININGROOM,"Dining Room 1");
        diningRoom2 = new DiningRoom(20, RoomType.DININGROOM,"Dining Room 2");
        diningRooms = new ArrayList<>();
        diningRooms.add(diningRoom1);
        hotel = new Hotel("Faulty Towers", bedrooms, conferenceRooms, diningRooms);
        guest1 = new Guest("Joe Bloggs", 100.0);
        guest2 = new Guest("Jane Bloggs", 60.00);
        guests1 = new ArrayList<>();
        guests1.add(guest1);
        guests2 = new ArrayList<>();
        guests2.add(guest1);
        guests2.add(guest2);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, room.getCapacity());
    }

    @Test
    public void guestsArrayListStartsEmpty(){
        assertEquals(0, room.getNumberOfGuests());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.BEDROOM, bedroom1.getRoomType());
    }

    @Test
    public void canAddGuestToGuestsArrayList(){
        bedroom1.addGuestToGuestsArrayList(guest1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestFromGuestsArrayList(){
        bedroom1.addGuestToGuestsArrayList(guest1);
        bedroom1.removeGuestFromGuestsArrayList(guest1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canCheckInSingleGuestIntoRoom(){
        diningRoom1.checkInSingleGuest(guest1);
        assertEquals(1, diningRoom1.getNumberOfGuests());
    }

    @Test
    public void wontCheckInSingleGuestWhenCapacityExceeded(){
        for (int i = 0; i < 11; i++){
            diningRoom1.checkInSingleGuest(guest1);
        }
        assertEquals(10, diningRoom1.getNumberOfGuests());
    }

    @Test
    public void canCheckMultipleGuestsIntoRoom(){
        bedroom2.checkInMultipleGuests(guests2);
        assertEquals(2, bedroom2.getNumberOfGuests());
    }

    @Test
    public void wontCheckInMultipleGuestsWhenRoomAlreadyOccupied(){
        bedroom2.checkInMultipleGuests(guests2);
        bedroom2.checkInMultipleGuests(guests2);
        assertEquals(2, bedroom2.getNumberOfGuests());
    }

    @Test
    public void wontCheckInMultipleGuestsWhenCapacityExceeded(){
        bedroom1.checkInMultipleGuests(guests2);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void bedroomExistsInHotel(){
        assertTrue(bedroom1.roomExistsInHotel(hotel));
    }

    @Test
    public void bedroomDoesntExistInHotel(){
        assertFalse(bedroom3.roomExistsInHotel(hotel));
    }

    @Test
    public void conferenceRoomExistsInHotel(){
        assertTrue(conferenceRoom1.roomExistsInHotel(hotel));
    }

    @Test
    public void conferenceRoomDoesntExistInHotel(){
        assertFalse(conferenceRoom2.roomExistsInHotel(hotel));
    }

    @Test
    public void diningRoomExistsInHotel(){
        assertTrue(diningRoom1.roomExistsInHotel(hotel));
    }

    @Test
    public void diningRoomDoesntExistInHotel(){
        assertFalse(diningRoom2.roomExistsInHotel(hotel));
    }

}
