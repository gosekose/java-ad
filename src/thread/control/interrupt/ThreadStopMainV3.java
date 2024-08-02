package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV3 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(100);
        log("작업 중단 지시");
        thread.interrupt();
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    log("작업 중");
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                log("state = " + Thread.currentThread().getState());
            }

            try {
                log("자원 정리");
                Thread.sleep(1000);
                log("work 스레드 인터럽트 상태3 = " + Thread.currentThread().isInterrupted());
                log("자원 정리 종료");
            } catch (InterruptedException e) {
                log("work 스레드 인터럽트 상태3 = " + Thread.currentThread().isInterrupted());
                log("interrupted message = " + e.getMessage());
                log("state = " + Thread.currentThread().getState());
            }
        }
    }
}
