package thread.ex1;

import static util.MyLogger.*;

public class CounterThreadMainV3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
            }
        }, "counter");

        thread.start();
    }
}
