package thread.control;

import util.MyLogger;

import static util.MyLogger.*;

public class ThreadInfoMain {
    public static void main(String[] args) {
        //main
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.theadId() = " + mainThread.threadId());
        log("mainThread.getName() = " + mainThread.getName());
        log("mainThread.getPriority() = " + mainThread.getPriority());
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());

        Thread myThread = new Thread(() -> {
            Thread thread = Thread.currentThread();
            log("myThread = " + thread);
            log("myThread.theadId() = " + thread.threadId());
            log("myThread.getName() = " + thread.getName());
            log("myThread.getPriority() = " + thread.getPriority());
            log("myThread.getThreadGroup() = " + thread.getThreadGroup());
            log("myThread.getState() = " + thread.getState());
        }, "myThread");

        myThread.start();
    }
}
