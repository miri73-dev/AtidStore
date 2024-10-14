package GroupTask;

import java.util.HashMap;

public class TourBookingSystem {
    private HashMap<Integer, Booking> bookings = new HashMap<>();
    public void addBooking(int bookingId, String tourName, int numGuests) {
        if (!bookings.containsKey(bookingId)) {
            bookings.put(bookingId, new Booking(bookingId, tourName, numGuests));

            System.out.println("Booking added: " + tourName);
        } else {
            System.out.println("Booking already exists.");
        }
    }
    public void updateBooking(int bookingId, int newNumGuests) {
        if (bookings.containsKey(bookingId)) {
            Booking booking = bookings.get(bookingId);
            booking.setNumGuests(newNumGuests);
            System.out.println("Booking updated: " + bookingId + " with guests: " + newNumGuests);
        } else {
            System.out.println("Booking not found.");
        }
    }
    public void cancelBooking(int bookingId) {
        if (bookings.remove(bookingId) != null) {
            System.out.println("Booking canceled: " + bookingId);
            } else {
            System.out.println("Booking not found.");
        }
    }
    public void displayAllBookings() {
        bookings.values().forEach(System.out::println);
    }
}