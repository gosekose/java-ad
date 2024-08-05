package object.time;

import java.time.Instant;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();

        long epochMilli = now.toEpochMilli();
        System.out.println("epochMilli = " + epochMilli);
    }
}
