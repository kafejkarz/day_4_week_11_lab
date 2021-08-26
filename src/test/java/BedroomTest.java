import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;


    @Before
    public void before(){
        bedroom = new Bedroom(1, 4 , RoomType.DOUBLE);
    }
    @Test
    public void checkRoomHaveNumber(){
        assertEquals(1,this.bedroom.getRoomNumber());
    }

    @Test
    public void checkRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }
}
