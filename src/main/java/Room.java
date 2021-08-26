import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList <Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
    public int getGuestCount (){
        return guests.size();
    }
    public int getCapacity() {
        return capacity;
    }

    public void addGuest(Guest guest){
        if(capacity > getGuestCount()){
        this.guests.add(guest);
    }}

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

}
