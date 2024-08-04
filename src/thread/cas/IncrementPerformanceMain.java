package thread.cas;

public class IncrementPerformanceMain {
    public static final long COUNT = 100_000_000L;

    public static void main(String[] args) {
        test(new BaseInteger());
        test(new VolatileInteger());
        test(new SynchronizedInteger());
        test(new MyAtomicInteger());
    }

    private static void test(IncrementInteger incrementInteger) {
        long start = System.currentTimeMillis();

        for (long i = 0; i < COUNT; i++) {
            incrementInteger.increment();
        }

        long end = System.currentTimeMillis();
        System.out.println(incrementInteger.getClass().getSimpleName() + " cost: " + (end - start) + "ms");
    }
}
