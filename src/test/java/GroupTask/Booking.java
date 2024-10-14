package GroupTask;

class Booking {
    private int bookingId;
    private String tourName;
    private int numGuests;
    public Booking(int bookingId, String tourName, int numGuests) {
        this.bookingId = bookingId;
        this.tourName = tourName;
        this.numGuests = numGuests;
    }
    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }
}
