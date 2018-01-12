import Hotel.Rooms.*;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room(1);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, room.getCapacity());
    }
}
