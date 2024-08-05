package object.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();

        inner.print();


        outer = null;
        inner.print(); // outer가 참조를 null로 바꾸더라도, inner는 outer의 참조를 가지고 있기 때문에 참조가 유지된다.
    }
}
