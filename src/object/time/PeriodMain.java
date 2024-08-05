package object.time;

import java.time.*;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);

        System.out.println("period = " + period);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plus = now.plus(period);
        System.out.println("plus = " + plus);

        LocalDate start = LocalDate.of(10, 10, 1);
        LocalDate end = LocalDate.of(12, 12, 4);

        Period between = Period.between(start, end);
        System.out.println("between = " + between);
    }

    // 특정 시점의 시간 : LocalDateTime, ZonedDateTime, Instant -> Temporal
    // 시간의 간격: Period, Duration -> TemporalAmount

    // 시간 단위와 시간 필드
    // TemporalUnit, ChronoUnit
}
