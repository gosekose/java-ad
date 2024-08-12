package executor.ex1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;

public class CallableMainV2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("submit 호출");
        Future<Integer> future = es.submit(new CallableMainV1.MyCallable());
        log("future 즉시 반환");
        Integer result = future.get(); // 실행 결과가 나올떄까지 기다림
        log("result value = " + result);
        log("future.get() = " + future);
        es.close();
    }
}
