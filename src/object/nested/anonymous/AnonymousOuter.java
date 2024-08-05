package object.nested.anonymous;

import object.clazz.Printer;

public class AnonymousOuter {

    public void process(int paramVar) {
        int localVar = 1;

        Printer anonymousPrinter = new Printer() {
            @Override
            public void print() {
                System.out.println("paramVar = " + paramVar);
                System.out.println("localVar = " + localVar);
            }
        };

        Printer anonymousPrinterV2 = () -> {
            System.out.println("paramVar = " + paramVar);
            System.out.println("localVar = " + localVar);
        };


        anonymousPrinter.print();
        anonymousPrinterV2.print();
    }
}
