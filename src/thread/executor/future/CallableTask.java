package thread.executor.future;

import util.MyLogger;

import java.util.concurrent.Callable;

import static util.MyLogger.log;

public class CallableTask implements Callable<Integer> {
    private final String name;
    private int sleepMs = 1000;

    public CallableTask(String name) {
        this.name = name;
    }

    public CallableTask(String name, int sleepMs) {
        this.name = name;
        this.sleepMs = sleepMs;
    }

    @Override
    public Integer call() throws Exception {
        log("실행");
        log("종료");
        return null;
    }
}
