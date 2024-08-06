package generic.ex4;

public class GenericMethod {

    public static <T extends Number> T getMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }

    // 제네릭 타입은 static 메서드에 타입 매개변수로 사용 불가
    // static 메서드는 클래스 단위로 작동하므로 제네릭 타입과는 무관
    // 제네릭 메서드를 사용해야함
    // class Box<T> -> static T 불가
    // static <T> T getMethod(T t) -> 가능
}
