package reservations;

import java.util.Random;

public class Reservations implements Reservationy{


    @Override
    public String getDowBooking() {
        String[] days ={ "MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
        Random r = new Random();
        return days[r.nextInt(7)];
    }

    @Override
    public String getCodeBooking() {
        String booking="";
        for (int i = 0; i < 8; i++) {
            int x;
            do {
                Random r = new Random();
                x = r.nextInt(91-48)+48;
            } while (x>=58 && x<=64);
            char c = (char)(x);
            booking+=c;
        }
        return booking;
    }
}
