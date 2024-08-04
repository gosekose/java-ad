package thread.cas;

public class VolatileInteger implements IncrementInteger {
    private int value;

    @Override
    public void increment() {
        value++;
    }

    @Override
    public int get() {
        return value;
    }
}
