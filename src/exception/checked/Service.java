package exception.checked;

public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            e.printStackTrace();
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 예외를 밖으로 던짐
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
