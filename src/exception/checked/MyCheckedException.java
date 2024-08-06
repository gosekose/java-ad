package exception.checked;

/**
 * Exception을 상속받은 예외는 Checked Exception이다.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
