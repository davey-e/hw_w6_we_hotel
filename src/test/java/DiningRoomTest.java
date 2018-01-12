import Hotel.Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(50, "Dining Room 1");
    }

    @Test
    public void hasRoomName(){
        assertEquals("Dining Room 1", diningRoom.getRoomName());
    }

}
