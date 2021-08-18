package Travels;

public class Hotel {
    private String hotelName;
    private boolean roomAvailability;
    private double roomPrice;

    public Hotel( String hotelName, double roomPrice) {

        this.hotelName = hotelName;
        this.roomAvailability = true;
        this.roomPrice = roomPrice;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public boolean isRoomAvailability() {
        return this.roomAvailability;
    }

    public double getRoomPrice() {
        return this.roomPrice;
    }

}
