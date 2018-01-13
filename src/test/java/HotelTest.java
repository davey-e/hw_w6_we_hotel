import Hotel.Hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel("Faulty Towers");
    }

    @Test
    public void hasName(){
        assertEquals("Faulty Towers", hotel.getName());
    }

}
