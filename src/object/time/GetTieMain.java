package object.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTieMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + dt.getYear());

        dt.withYear(2020);
    }
}
