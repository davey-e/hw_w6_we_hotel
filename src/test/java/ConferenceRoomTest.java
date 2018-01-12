import Hotel.Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20, "Lomond");
    }

    @Test
    public void hasRoomName(){
        assertEquals("Lomond", conferenceRoom.getRoomName());
    }
}
