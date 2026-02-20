package HotelReservationSystem;

public class Room {
    private int roomId;
    private String category;
    private double price;
    private boolean isAvailable;

    public Room(int roomId, String category, double price, boolean isAvailable) {
        this.roomId = roomId;
        this.category = category;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getRoomId() { return roomId; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return roomId + "," + category + "," + price + "," + isAvailable;
    }
}

