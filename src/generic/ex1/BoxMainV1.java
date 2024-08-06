package generic.ex1;

public class BoxMainV1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        System.out.println("Integer Value: " + integerBox.get());

        StringBox stringBox = new StringBox();
        stringBox.set("Hello World");
    }
}
