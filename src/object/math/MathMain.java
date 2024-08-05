package object.math;

public class MathMain {
    public static void main(String[] args) {
        System.out.println("max(10, 20)" + Math.max(10, 20));
        System.out.println("min(10, 20)" + Math.min(10, 20));
        System.out.println("abs(-10)" + Math.abs(-10));

        System.out.println("ceil(10.1)" + Math.ceil(10.1));
        System.out.println("floor(10.9)" + Math.floor(10.9));
        System.out.println("round(10.5)" + Math.round(10.5));

        System.out.println("sqrt(100)" + Math.sqrt(100));
        System.out.println("random() " + Math.random());
    }
}
