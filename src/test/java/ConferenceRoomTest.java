import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, "The Cameron Suite");
        guest = new Guest("Sergio", 21);
    }
    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(2 ,conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("The Cameron Suite", conferenceRoom.getName());
    }

    @Test
    public void conferenceRoomCanAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void conferenceRoomCanRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void conferenceRoomCantGoOverCapacity(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(2, conferenceRoom.getCapacity());
    }
}
