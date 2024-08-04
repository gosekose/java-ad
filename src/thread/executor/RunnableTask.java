package thread.executor;

import util.MyLogger;
import util.ThreadUtils;

import static util.MyLogger.*;
import static util.ThreadUtils.sleep;

public class RunnableTask implements Runnable {
    private final String name;
    private int sleeps = 1000;

    public RunnableTask(String name) {
        this.name = name;
    }

    public RunnableTask(String name, int sleeps) {
        this.name = name;
        this.sleeps = sleeps;
    }

    @Override
    public void run() {
        log("시작");
        sleep(sleeps);
        log("종료");
    }
}
