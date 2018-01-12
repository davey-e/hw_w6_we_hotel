import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Michael Davidson", 100.00);
    }

    @Test
    public void hasName(){
        assertEquals("Michael Davidson", guest.getName());
    }
}
