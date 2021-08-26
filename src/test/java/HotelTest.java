import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room bedroom;
    Guest guest;


    @Before
    public void before(){
        hotel = new Hotel("Faulty Tower");
        bedroom = new Bedroom(2, 3, RoomType.DOUBLE);
        guest = new Guest("Arek", 21);
    }

    @Test
    public void hotelHaveName(){
        assertEquals("Faulty Tower", this.hotel.getName());
    }

    @Test
    public void checkCanAddToRoomCollection(){
        hotel.addRoomToCollection(bedroom);
        assertEquals(1, hotel.getRoomCount());

    }

    @Test
    public void canCheckInGuest(){
        hotel.addRoomToCollection(bedroom);
        hotel.canCheckInGuest(bedroom, guest);
        assertEquals(1, this.bedroom.getGuestCount());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.addRoomToCollection(bedroom);
        hotel.canCheckOutGuest(bedroom, guest);
        assertEquals(0, this.bedroom.getGuestCount());
    }


}
