package thread.control.join;

import static util.MyLogger.*;
import static util.ThreadUtils.sleep;

public class JoinMainV0 {
    public static void main(String[] args) throws InterruptedException {
        log("start");
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(new Job(), "myThread-1");
        Thread thread2 = new Thread(new Job(), "myThread-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        log("end");
        log("duration = " + (System.currentTimeMillis() - start));
    }

    static class Job implements Runnable {
        @Override
        public void run() {
            log("start");
            sleep(1000);
            log("end");
        }
    }
}
