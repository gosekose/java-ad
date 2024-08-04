package thread.executor;

import util.MyLogger;
import util.ThreadUtils;

import java.util.Random;

import static util.MyLogger.*;
import static util.ThreadUtils.*;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        thread.join();

        log("main 시작");
        int value = myRunnable.value;
        log("value = " + value);
    }

    static class MyRunnable implements Runnable {
        int value;

        @Override
        public void run() {
            log("Runnable 시작");
            sleep(2000);
            value = new Random().nextInt(10);
            log("value = " + value);
            log("Runnable 종료");
        }
    }
}
