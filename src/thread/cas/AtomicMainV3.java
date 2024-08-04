package thread.cas;

import util.ThreadUtils;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static util.MyLogger.log;
import static util.ThreadUtils.*;

public class AtomicMainV3 {

    private static final int THREAD_COUNT = 2;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("atomicInteger = " + atomicInteger.get());

        Runnable runnable = () -> incrementAndGet(atomicInteger);

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable, "Thread-" + i);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int result = atomicInteger.get();
        System.out.println("result = " + result);
    }

    public static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;
        do {
            getValue = atomicInteger.get(); // 0
            sleep(100);
            log("getValue = " + getValue);
            result = atomicInteger.compareAndSet(getValue, getValue + 1);
        } while (!result);

        return getValue + 1;
    }
}

