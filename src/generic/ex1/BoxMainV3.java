package generic.ex1;

public class BoxMainV3 {
    public static void main(String[] args) {
        GenericBox<Integer> box = new GenericBox<>();
        box.set(10);
        System.out.println("Integer Value: " + box.get());

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
    }
}
