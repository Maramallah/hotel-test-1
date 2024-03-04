
package first.test;

import java.util.ArrayList;


public class Room {
      private final int roomNumber;
    private String type;
    private boolean available;
    private double price;
    private static ArrayList<Room> allRooms = new ArrayList<>();
    static {
      
        for (int i = 1; i <= 5; i++) {
            new Room(i, "Double", 150.0);
        }

       
        for (int i = 6; i <= 15; i++) {
            new Room(i, "Single", 100.0);
        }
    }

    public Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.available = true;
         allRooms.add(this);
    }
    
    

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
     public static ArrayList<Room> getAllRooms() {
        return allRooms;
    }

   
    public String ROOMINFO() {
        return "Room{" + "roomNumber=" + roomNumber + ", type='" + type + '\'' + ", available=" + available
                + ", price=" + price +" $ per night"+ '}';
    }
    
}
