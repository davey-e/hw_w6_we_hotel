import Hotel.Enum.BedroomType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTypeTest {

    BedroomType bedroomType;

    @Test
    public void canGetRoomOccupancy(){
        assertEquals(1, bedroomType.SINGLE.getOccupancy());
    }
}
