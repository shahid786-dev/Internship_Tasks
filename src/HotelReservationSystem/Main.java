package HotelReservationSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HotelManager manager = new HotelManager();

        while(true) {
            System.out.println("\n1.Search Room\n2.Book Room\n3.Cancel\n4.View Bookings\n5.Exit");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter category: ");
                    manager.searchRooms(sc.next());
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    Customer c = new Customer(1, sc.next());
                    System.out.print("Enter Room ID: ");
                    manager.bookRoom(c, sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Reservation ID: ");
                    manager.cancelReservation(sc.nextInt());
                    break;

                case 4:
                    manager.viewBookings();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}

