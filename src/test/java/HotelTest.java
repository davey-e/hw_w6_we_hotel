import Hotel.Enum.RoomType;
import Hotel.Hotel;
import Hotel.Room.Bedroom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ArrayList<Bedroom> bedrooms;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, RoomType.SINGLE, 50.00);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE, 80.00);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        hotel = new Hotel("Faulty Towers", bedrooms);
    }

    @Test
    public void hasName(){
        assertEquals("Faulty Towers", hotel.getName());
    }

    @Test
    public void hasBedroomsArrayList(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }

}
