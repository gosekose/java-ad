package object.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 4;

    // static이 아닌 내부클래스는 바깥 인스턴스 변수 사용 가능
    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println("innerInstanceValue = " + innerInstanceValue);
            System.out.println("outInstanceValue = " + outInstanceValue);
            System.out.println("outClassValue = " + outClassValue);
        }
    }
}
