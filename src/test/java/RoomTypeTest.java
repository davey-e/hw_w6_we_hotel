import Hotel.Enum.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTypeTest {

    RoomType roomType;

    @Test
    public void canGetRoomOccupancy(){
        assertEquals(1, roomType.SINGLE.getOccupancy());
    }
}
