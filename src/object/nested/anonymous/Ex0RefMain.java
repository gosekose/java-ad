package object.nested.anonymous;

public class Ex0RefMain {
    public static void hello(VoidFunction func) {
        System.out.println("프로그램 시작");
        func.apply();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(() -> System.out.println("args = " + args));
    }
}
