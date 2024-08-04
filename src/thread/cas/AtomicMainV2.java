package thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

import static util.MyLogger.*;

public class AtomicMainV2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("atomicInteger = " + atomicInteger.get());

        int result1 = incrementAndGet(atomicInteger);
        System.out.println("result = " + result1);

        int result2 = incrementAndGet(atomicInteger);
        System.out.println("result = " + result2);
    }

    public static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;
        do {
            getValue = atomicInteger.get(); // 0
            log("getValue = " + getValue);
            result = atomicInteger.compareAndSet(getValue, getValue + 1);
        } while (!result);

        return getValue + 1;
    }
}
