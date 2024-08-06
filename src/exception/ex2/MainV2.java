package exception.ex2;

import exception.ex1.NetworkServiceV1_3;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {
        NetworkServiceV2 networkService = new NetworkServiceV2();

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
