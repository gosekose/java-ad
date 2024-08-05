package object.nested.ex2;

public class NestedOuter {
    private int outerValue = 10;
    private static int outerStaticValue = 30;

    static class Nested {
        private int innerValue = 20;
        public void print() {
            System.out.println("innerValue = " + innerValue);
            System.out.println("outerStaticValue = " + outerStaticValue);
        }
    }

    public static void main(String[] args) {
        new Nested().print();
    }
}
