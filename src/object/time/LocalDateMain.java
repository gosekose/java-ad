package object.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2011, 11, 21);

        System.out.println("nowDate = " + nowDate);
        System.out.println("localDate = " + ofDate);

        ofDate = ofDate.plusDays(10);
        System.out.println("plusOfDate = " + ofDate);

        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("nowTime = " + nowTime);
        System.out.println("ofTime = " + ofTime);

        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("ofTimePlus = " + ofTimePlus);

    }
}
