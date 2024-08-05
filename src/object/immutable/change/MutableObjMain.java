package object.immutable.change;

public class MutableObjMain {

    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        System.out.println("obj = " + obj);

        obj.add(20);

        System.out.println("obj = " + obj);
    }
}
