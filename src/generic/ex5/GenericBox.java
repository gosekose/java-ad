package generic.ex5;

public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    // 제네릭 타입 이레이저
    // 자바 컴파일 단계에서만 사용 (.java) => 제네릭 타입 매개변수 존재
    // 자바 바이트코드 (.class) => 타입 매개변수가 제거된 상태
}
