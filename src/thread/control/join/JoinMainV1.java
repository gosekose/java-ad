package thread.control.join;

import static util.MyLogger.log;

public class JoinMainV1 {
    public static void main(String[] args) throws InterruptedException {
        log("start");
        long total;

        SumRunnable runnable1 = new SumRunnable(1, 100000);
        SumRunnable runnable2 = new SumRunnable(100001, 200000);
        Thread thread1 = new Thread(runnable1, "thread1");
        Thread thread2 = new Thread(runnable2, "thread2");

        thread1.start();
        thread2.start();

        thread1.join(1000); // 1초만 기다리다가 종료되기
        thread2.join();

        total = runnable1.getValue() + runnable2.getValue();

        System.out.println("total = " + total);

        log("end");
    }

    static class SumRunnable implements Runnable {
        private final int start;
        private final int end;
        private long value;

        public SumRunnable(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                value += i;
            }
        }

        public Long getValue() {
            return value;
        }
    }
}
