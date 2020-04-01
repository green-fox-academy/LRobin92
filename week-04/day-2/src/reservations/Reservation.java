package reservations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {
    Random random = new Random();

    @Override
    public String getDowBooking() {
        List<String> dayOfWeek = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
        int randomIndexOfDays = random.nextInt(dayOfWeek.size()-1);
        return String.format(dayOfWeek.get(randomIndexOfDays));
    }

    @Override
    public String getCodeBooking() {
        String reservationCode = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomCharacters = "";
        int randomIndex;
        for (int i = 0; i < 8; i++) {
            randomIndex = random.nextInt(reservationCode.length());
            randomCharacters += reservationCode.charAt(randomIndex);
        }
        return randomCharacters;
    }
}
