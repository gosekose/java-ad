package exception.ex5;

import java.util.Scanner;

public class MainV5 {
    public static void main(String[] args) {
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("메시지를 입력하세요.");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메세지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==== 개발자용 디버깅 메세지 =====");
        e.printStackTrace(System.out);

        // 필요하면 예외 별로 공통 에러 처리
    }
}
