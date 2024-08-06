package exception.ex2;

import exception.ex1.NetworkClientV1;

public class NetworkServiceV2 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + e.getErrorCode());
        } finally {
            client.disconnect();
        }
    }
}
