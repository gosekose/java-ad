package thread.ex1;

import util.MyLogger;

public class CounterThreadMainV2 {
    public static void main(String[] args) {
        Runnable runnable = new CounterRunnable();

        Thread thread = new Thread(runnable, "counter");

        thread.start();
    }

    static class CounterRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                MyLogger.log("value: " + i);
            }
        }
    }
}
