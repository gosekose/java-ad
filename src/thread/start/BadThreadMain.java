package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main().start");

        HelloThread hello = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start 호출 전");
        hello.run();
        System.out.println(Thread.currentThread().getName() + ": start 호출 후 ");

        System.out.println(Thread.currentThread().getName() + ": main().end");
    }
}