package object.immutable.change;


public class ImmutableObj {
    private final int value;

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;

        return new ImmutableObj(result);
    }

    public ImmutableObj(int value) {
        this.value = value;
    }
}
