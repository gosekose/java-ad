package exception.ex1;

import exception.ex0.NetworkServiceV0;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_1 networkServiceV1 = new NetworkServiceV1_1();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("메시지를 입력하세요.");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            networkServiceV1.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
