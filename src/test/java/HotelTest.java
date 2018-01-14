import Hotel.Enum.BedroomType;
import Hotel.Hotel;
import Hotel.Room.Bedroom;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.DiningRoom;
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
    DiningRoom diningRoom1;
    ArrayList<DiningRoom> diningRooms;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, BedroomType.SINGLE, 50.00);
        bedroom2 = new Bedroom(2, BedroomType.DOUBLE, 80.00);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRoom1 = new ConferenceRoom(20, "Lomond", 2000.00);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom1);
        diningRoom1 = new DiningRoom(50, "Dining Room 1");
        diningRooms = new ArrayList<>();
        diningRooms.add(diningRoom1);
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

}
