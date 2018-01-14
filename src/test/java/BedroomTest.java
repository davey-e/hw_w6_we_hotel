import Hotel.Enum.BedroomType;
import Hotel.Room.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, BedroomType.SINGLE, 50.00);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(BedroomType.SINGLE, bedroom.getBedroomType());
    }

    @Test
    public void hasRate(){
        assertEquals(50.00, bedroom.getRate(), 0.01);
    }

}
