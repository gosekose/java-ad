package exception.checked;

public class CheckedCatchMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();

        service.callCatch();

        service.callThrow();
    }
}
