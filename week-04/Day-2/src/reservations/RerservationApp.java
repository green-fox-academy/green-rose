package reservations;

import java.util.Random;

public class RerservationApp {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Reservations reservations = new Reservations();
            System.out.println("Booking# "+reservations.getCodeBooking()+" for "+reservations.getDowBooking());
        }
    }
}
