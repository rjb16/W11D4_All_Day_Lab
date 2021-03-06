import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();

    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
    public int countGuests(){
        return this.guests.size();
    }
    public void addGuests(Guest guest){
        this.guests.add(guest);
    }
    public void removeGuests(Guest guest){
        this.guests.remove(guest);
    }
}
