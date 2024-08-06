package exception.ex4;

import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            throw new NetworkClientExceptionV4("연결 오류: " + address);
        }

        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            throw new NetworkClientExceptionV4("전송 오류: " + data);
        }

        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
