import Hotel.Enum.RoomType;
import Hotel.Hotel;
import Hotel.Room.Bedroom;
import Hotel.Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ArrayList<Bedroom> bedrooms;
    ConferenceRoom conferenceRoom1;
    ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, RoomType.SINGLE, 50.00);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE, 80.00);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRoom1 = new ConferenceRoom(20, "Lomond", 2000.00);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom1);
        hotel = new Hotel("Faulty Towers", bedrooms, conferenceRooms);
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

}
