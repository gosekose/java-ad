package thread.ex1;

import static util.MyLogger.*;

public class ThreadCallMainV1 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyTimeRunnable(1000L, "A"), "Thread-A");
        Thread threadB = new Thread(new MyTimeRunnable(500L, "B"), "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class MyTimeRunnable implements Runnable {
        private final Long sleepTimeMillis;
        private final String content;

        public MyTimeRunnable(Long sleepTimeMillis, String content) {
            this.sleepTimeMillis = sleepTimeMillis;
            this.content = content;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                try {
                    Thread.sleep(sleepTimeMillis);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
