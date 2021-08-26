import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> roomCollection;

    public Hotel(String name){
        this.name = name;
        this.roomCollection = new ArrayList<>();
    }

    public ArrayList<Room> getRoomCollection() {
        return roomCollection;
    }

    public String getName() {
        return name;
    }

    public void addRoomToCollection(Room room){
        roomCollection.add(room);
    }

    public int getRoomCount() {
        return roomCollection.size();
    }

    public void canCheckInGuest(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public void canCheckOutGuest(Room bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }
}
