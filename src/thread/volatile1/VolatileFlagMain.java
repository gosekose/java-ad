package thread.volatile1;

import util.MyLogger;
import util.ThreadUtils;

import static util.MyLogger.*;
import static util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "myThread");
        log("runFlag = " + task.runFlag);
        thread.start();
        sleep(500);
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {
        boolean runFlag = true;

        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {
                // 탈출
            }
            log("task 종료");
        }
    }
}
