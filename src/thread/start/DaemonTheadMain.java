package thread.start;

public class DaemonTheadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main().start");
        DaemonThead daemonThead = new DaemonThead();
        daemonThead.setDaemon(true);
        daemonThead.start();
        System.out.println(Thread.currentThread().getName() + ": main().end");
    }

    static class DaemonThead extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()");
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println("e = " + e);
                throw new RuntimeException();
            }

            System.out.println(Thread.currentThread().getName() + ": run()");
        }
    }
}
