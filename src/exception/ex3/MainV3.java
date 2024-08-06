package exception.ex3;

import exception.ex2.NetworkServiceV2;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
        NetworkServiceV3 networkService = new NetworkServiceV3();

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
