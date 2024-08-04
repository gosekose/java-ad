package thread.executor.future;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.List.of;

public class InvokeAnyMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        CallableTask task1 = new CallableTask("task1", 10);
        CallableTask task2 = new CallableTask("task2", 10);
        CallableTask task3 = new CallableTask("task3", 10);

        Integer i = es.invokeAny(of(task1, task2, task3));
        System.out.println("i = " + i);

        es.close();
    }
}
