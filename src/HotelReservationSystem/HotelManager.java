package HotelReservationSystem;

import java.util.*;

public class HotelManager {

    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public HotelManager() {
        rooms.add(new Room(101, "Standard", 50, true));
        rooms.add(new Room(102, "Deluxe", 100, true));
        rooms.add(new Room(103, "Suite", 200, true));
    }

    public void searchRooms(String category) {
        for (Room r : rooms) {
            if (r.getCategory().equalsIgnoreCase(category) && r.isAvailable()) {
                System.out.println("Available Room: " + r.getRoomId());
            }
        }
    }

    public void bookRoom(Customer customer, int roomId) {
        for (Room r : rooms) {
            if (r.getRoomId() == roomId && r.isAvailable()) {
                if (Payment.processPayment(r.getPrice())) {
                    r.setAvailable(false);
                    Reservation res = new Reservation(reservations.size()+1, customer, r);
                    reservations.add(res);
                    FileHandler.saveReservation(res);
                    System.out.println("Room Booked Successfully ✅");
                }
                return;
            }
        }
        System.out.println("Room not available ❌");
    }

    public void cancelReservation(int reservationId) {
        Iterator<Reservation> it = reservations.iterator();
        while (it.hasNext()) {
            Reservation r = it.next();
            if (r.getReservationId() == reservationId) {
                r.getRoom().setAvailable(true);
                it.remove();
                System.out.println("Reservation Cancelled ✅");
                return;
            }
        }
        System.out.println("Reservation not found ❌");
    }

    public void viewBookings() {
        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }
}

