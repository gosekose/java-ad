package object.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());

        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());
    }
}
