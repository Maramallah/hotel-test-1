
package first.test;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstTest {
   private static ArrayList<Room> rooms = new ArrayList<>();
    private static ArrayList<Clients> bookings = new ArrayList<>();
    public static void main(String[] args) {
        
        displayHomePage();
       
    }
    public static void displayHomePage() {
        int choice;
        Clients client1=new Clients();
        System.out.println("WELCOME TO OUR MOTEL COMFORT GROVE IN IBIZA !!!");
        do{
        
        System.out.println("1.Explore available rooms");
        System.out.println("2.Book a room");
        System.out.println("3.Display booked rooms");
        System.out.println("4.Exit the system");
        System.out.println("Please choose an option:");

         choice = new Scanner(System.in).nextInt();

        switch (choice) {
            case 1:
                exploreRooms();
                break;
            case 2:
                client1.bookRoom();
                break;
            case 3:
                viewBookings();
                break;
            case 4:
                exitSystem();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                displayHomePage();
                break;
        }
        }while(choice !=4);
    }
    
    public static void exploreRooms() {
        System.out.println("Available rooms:");
        for(Room room:rooms){
            if(room.isAvailable()){
                System.out.println("Room "+room.getRoomNumber());
            }}
       
    }
     public static void viewBookings() {
        System.out.println("List of Bookings:");
        //Clients.for(Clients booking: bookings) -> System.out.println("Guest: " + booking.getName() + ", Room: " + booking.getRoom().getRoomNumber()));
        
    }
      public static void exitSystem() {
        System.out.println("Thank you for using the Hotel Management System. Goodbye!");
       // Scanner.close();
        System.exit(0);
    }
    
}
