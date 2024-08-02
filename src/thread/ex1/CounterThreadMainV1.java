package thread.ex1;

import util.MyLogger;

public class CounterThreadMainV1 {
    public static void main(String[] args) {
        Thread thread = new CounterThread();
        thread.setName("counter");

        thread.start();
    }

    static class CounterThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                MyLogger.log("value: " + i);
            }
        }
    }
}
