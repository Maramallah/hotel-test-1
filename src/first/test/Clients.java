
package first.test;

import java.util.ArrayList;
import java.util.Scanner;


public class Clients {
     String name;
    int roomNumber;
   String checkInDate;
   String checkOutDate;
   Room room;
   static int number_of_clients=0;
    public ArrayList<Room> rooms ;
    public ArrayList<Clients> bookings ;

    public Clients() {
    }
    

        public Clients(String name, String checkInDate, String checkOutDate, Room room) {
            this.name = name;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            this.room = room;
        }
         public void bookRoom() {
         Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter the following information to book a room :");
        // Get the user's name, room number, check-in date and check-out date
        System.out.print("Enter a room number:");
         this.roomNumber  = scanner.nextInt();
       
        System.out.print("Enter guest name:");
       this.name = scanner.next();
        System.out.print("Enter check-in date:");
       this.checkInDate  = scanner.next();
        System.out.print("Enter check-out date:");
       this.checkOutDate  = scanner.next();
        boolean is_booked=false;
        for (Room room : Room.getAllRooms()) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                room.setAvailable(false);
                bookings.add(new Clients( name,  checkInDate, checkOutDate,room));
                System.out.println("Room "+ Room.class + " is booked successfully for "+ name + " from "+ checkInDate + " to " + checkOutDate);
                is_booked=true;
                break;
            }
           
}
if (!is_booked)
{
 System.out.println("Room " + roomNumber + " is not available.");
}
     }

        
        public String userInfo() {
            return "Clients{" + "name=" + name + ", roomNumber=" + roomNumber + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", room=" + room + '}';
        }
    
     
    
}
