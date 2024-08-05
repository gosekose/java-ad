package object.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());

        b.setValue("부산");
        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());

    }
}
