package object.tostring;

public class Car {
    private String carName;
    private int age;

    public Car(String carName, int age) {
        this.carName = carName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "carName = " + carName + " / age = " + age;
    }
}

// 정적 의존 관계
// 컴파일 단에서 확인
// 동적 의존 관계
// 런타임 단에서 확인
