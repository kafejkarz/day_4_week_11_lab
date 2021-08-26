
public class Bedroom extends Room{

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(int roomNumber,int capacity, RoomType roomType){
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType =roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
    return this.roomType;
    }

}
