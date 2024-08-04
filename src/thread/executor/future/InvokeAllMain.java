package thread.executor.future;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.List.*;

public class InvokeAllMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        CallableTask task1 = new CallableTask("task1", 10);
        CallableTask task2 = new CallableTask("task2", 10);
        CallableTask task3 = new CallableTask("task3", 10);

        List<Future<Integer>> futures = es.invokeAll(of(task1, task2, task3));

        for (Future<Integer> future : futures) {
            try {
                Integer result = future.get();
                System.out.println("result = " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        es.shutdown();
    }
}
