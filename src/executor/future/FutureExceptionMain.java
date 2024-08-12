package executor.future;

import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class FutureExceptionMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("작업 전달");
        Future<Integer> future = es.submit(new ExCallable());
        sleep(1000);

        log("future.get() 호출 시도, future.state(): " + future.state());

        try {
            Integer result = future.get();
            log("결과: " + result);
        } catch (InterruptedException e) {
            log("InterruptedException 예외 발생: " + e.getClass().getSimpleName());
        } catch (ExecutionException e) {
            log("ExecutionException 예외 발생: " + e.getClass().getSimpleName());
            Throwable cause = e.getCause();
            log("원인: " + cause.getClass().getSimpleName());
        }

        es.close();

    }

    static class ExCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Callable 실행, 예외 발생");
            throw new IllegalAccessException("예외 발생");
        }
    }
}
