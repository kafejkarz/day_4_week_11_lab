import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Arek", 21);
    }

    @Test
    public void guestHaveName(){
        assertEquals("Arek", this.guest.getName());
    }

    @Test
    public void guestHaveAge(){
        assertEquals(21, this.guest.getAge());
    }

}
