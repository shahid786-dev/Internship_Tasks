package HotelReservationSystem;

public class Reservation {
    private int reservationId;
    private Customer customer;
    private Room room;

    public Reservation(int reservationId, Customer customer, Room room) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.room = room;
    }

    public int getReservationId() { return reservationId; }
    public Customer getCustomer() { return customer; }
    public Room getRoom() { return room; }

    @Override
    public String toString() {
        return reservationId + "," + customer.getName() + "," + room.getRoomId();
    }
}

