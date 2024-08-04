package thread.executor.future;

import util.MyLogger;
import util.ThreadUtils;

import java.util.Random;
import java.util.concurrent.*;

import static util.MyLogger.*;
import static util.ThreadUtils.sleep;

public class CallableMainV1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new MyCallable());
        Integer value = future.get();
        log("value = " + value);
        log("main 종료");
        executorService.close();
    }

    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Callable 시작");
            sleep(2000);
            int value = new Random().nextInt(10);
            log("value = " + value);
            log("Callable 종료");
            return value;
        }
    }
}
