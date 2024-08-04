package thread.collection.simple;

import util.MyLogger;

import static util.MyLogger.log;

public class SimpleListMainV2 {
    public static void main(String[] args) throws InterruptedException {
        BasicList basicList = new BasicList();
        SyncProxyList syncProxyList = new SyncProxyList(basicList);
        test(syncProxyList);
    }

    public static void test(SimpleList list) throws InterruptedException {
        log(list.getClass().getSimpleName());

        Runnable runnableA = () -> {
            log("Thread-1: list.add(A)");
            list.add("A");
            log("Thread-1: list = " + list);
        };

        Runnable runnableB = () -> {
            log("Thread-2: list.add(B)");
            list.add("B");
            log("Thread-2: list = " + list);
        };

        Thread thread1 = new Thread(runnableA, "Thread-1");
        Thread thread2 = new Thread(runnableB, "Thread-2");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

