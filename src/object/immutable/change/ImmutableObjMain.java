package object.immutable.change;

public class ImmutableObjMain {

    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        System.out.println("obj = " + obj);

        ImmutableObj newObj = obj.add(20);

        System.out.println("obj = " + obj);
        System.out.println("newObj = " + newObj);
    }
}
