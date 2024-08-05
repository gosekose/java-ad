package object.time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        for (String zoneId : availableZoneIds) {
            System.out.println("zoneId = " + zoneId);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
            ZonedDateTime utc = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
            System.out.println("utc = " + utc);
            System.out.println("zonedDateTime = " + zonedDateTime);
        }
    }
}
