package object.clazz;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("outInstanceVar = " + outInstanceVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("localVar = " + localVar);
            }
        }

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV4 = new LocalOuterV4();
        Printer printer = localOuterV4.process(2);
        printer.print();
    }
}
