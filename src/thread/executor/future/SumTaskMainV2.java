package thread.executor.future;

import java.util.concurrent.*;

public class SumTaskMainV2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SumTask sumTask1 = new SumTask(1, 50);
        SumTask sumTask2 = new SumTask(51, 100);

        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Integer> future = es.submit(sumTask1);
        Future<Integer> future2 = es.submit(sumTask2);

        try {
            int sum = future.get();
            int sum2 = future2.get();
            System.out.println("sum = " + sum);
            System.out.println("sum2 = " + sum2);
            System.out.println("total = " + (sum + sum2));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            es.close();
        }
    }

    public static class SumTask implements Callable<Integer> {
        int startValue;
        int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
