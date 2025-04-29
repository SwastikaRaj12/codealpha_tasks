import java.util.*;
public class hotel {
    
    // Room class representing a hotel room
    static class Room {
        int roomNumber;
        boolean isAvailable;
        
        public Room(int roomNumber) {
            this.roomNumber = roomNumber;
            this.isAvailable = true; // Rooms are available initially
        }

        @Override
        public String toString() {
            return "Room " + roomNumber + (isAvailable ? " (Available)" : " (Booked)");
        }
    }

    // A list of rooms in the hotel
    static List<Room> rooms = new ArrayList<>();
    
    public static void main(String[] args) {
        // Initialize rooms in the hotel (Assuming the hotel has 10 rooms)
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i));
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. Book a Room");
            System.out.println("2. Cancel a Reservation");
            System.out.println("3. View Available Rooms");
            System.out.println("4. View All Reservations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookRoom(scanner);
                    break;
                case 2:
                    cancelReservation(scanner);
                    break;
                case 3:
                    viewAvailableRooms();
                    break;
                case 4:
                    viewAllReservations();
                    break;
                case 5:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Method to book a room
    public static void bookRoom(Scanner scanner) {
        System.out.print("Enter the room number to book (1-10): ");
        int roomNumber = scanner.nextInt();

        if (roomNumber < 1 || roomNumber > 10) {
            System.out.println("Invalid room number. Please choose a room between 1 and 10.");
            return;
        }

        Room room = rooms.get(roomNumber - 1);

        if (room.isAvailable) {
            room.isAvailable = false;
            System.out.println("Room " + roomNumber + " has been successfully booked.");
        } else {
            System.out.println("Sorry, Room " + roomNumber + " is already booked.");
        }
    }

    // Method to cancel a reservation
    public static void cancelReservation(Scanner scanner) {
        System.out.print("Enter the room number to cancel the reservation (1-10): ");
        int roomNumber = scanner.nextInt();

        if (roomNumber < 1 || roomNumber > 10) {
            System.out.println("Invalid room number. Please choose a room between 1 and 10.");
            return;
        }

        Room room = rooms.get(roomNumber - 1);

        if (!room.isAvailable) {
            room.isAvailable = true;
            System.out.println("Reservation for Room " + roomNumber + " has been successfully cancelled.");
        } else {
            System.out.println("No reservation found for Room " + roomNumber + ".");
        }
    }

    // Method to view available rooms
    public static void viewAvailableRooms() {
        System.out.println("\n--- Available Rooms ---");
        for (Room room : rooms) {
            if (room.isAvailable) {
                System.out.println(room);
            }
        }
    }

    // Method to view all reservations
    public static void viewAllReservations() {
        System.out.println("\n--- All Reservations ---");
        for (Room room : rooms) {
            if (!room.isAvailable) {
                System.out.println(room);
            }
        }
    }
}
