import Hotel.Enum.RoomType;
import Hotel.Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20, RoomType.CONFERENCEROOM, "Lomond", 2000.00);
    }

    @Test
    public void hasRoomName(){
        assertEquals("Lomond", conferenceRoom.getRoomName());
    }

    @Test
    public void hasRate(){
        assertEquals(2000.00, conferenceRoom.getRate(), 0.01);
    }
}
