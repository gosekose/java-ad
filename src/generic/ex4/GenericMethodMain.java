package generic.ex4;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer method = GenericMethod.<Integer>getMethod(10);

        Integer method1 = GenericMethod.getMethod(10);
    }
}
