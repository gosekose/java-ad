package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3 {
    private final String message;

    public SendExceptionV3(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
