package exception.ex1;

import java.util.Scanner;

public class MainV1_2 {
    public static void main(String[] args) {
        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("메시지를 입력하세요.");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
