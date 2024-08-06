package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkServiceV0 = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("메시지를 입력하세요.");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            networkServiceV0.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
