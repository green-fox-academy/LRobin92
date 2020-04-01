package reservations;

public class Main {
    public static void main(String[] args) {
        Reservation res = new Reservation();

        for (int i = 0; i <  6; i++) {
            System.out.println("Booking# " + res.getCodeBooking() + " for " + res.getDowBooking());
        }
    }
}
