package thread.control;

import static util.MyLogger.*;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread");
        log("thread.state = " + thread.getState());
        log("myThread.start()");
        thread.start();

        Thread.sleep(1000);
        log("thread.state = " + thread.getState());

        Thread.sleep(5000);
        log("thread.state = " + thread.getState());
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log("start()");
            log("myThread.state2 = " + Thread.currentThread().getState());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
