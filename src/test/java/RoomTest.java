import Hotel.Enum.RoomType;
import Hotel.Guest;
import Hotel.Room.Bedroom;
import Hotel.Room.DiningRoom;
import Hotel.Room.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    DiningRoom diningRoom1;
    ArrayList<Guest> guests1;
    ArrayList<Guest> guests2;

    @Before
    public void before(){
        room = new Room(1);
        bedroom1 = new Bedroom(1, RoomType.SINGLE, 50.00);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE, 100.00);
        diningRoom1 = new DiningRoom(10, "Dining Room 1");
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
    public void canAddGuestsToGuestsArrayList(){
        bedroom1.addGuestToGuestsArrayList(guest1);
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

}
