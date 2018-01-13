import Hotel.Enum.RoomType;
import Hotel.Guest;
import Hotel.Room.Bedroom;
import Hotel.Room.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        room = new Room(1);
        bedroom = new Bedroom(1, RoomType.SINGLE, 50.00);
        guest1 = new Guest("Joe Bloggs", 100.0);
        guest2 = new Guest("Jane Bloggs", 60.00);
        guests = new ArrayList<>();
        guests.add(guest1);
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
        bedroom.addGuestToGuestsArrayList(guest1);
    }

    @Test
    public void canCheckMultipleGuestsIntoRoom(){
        bedroom.CheckInMultipleGuests(guests);
        assertEquals(1, bedroom.getNumberOfGuests());
    }
}
