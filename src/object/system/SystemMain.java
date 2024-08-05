package object.system;

import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long currentNano = System.nanoTime();

        System.out.println("currentNano = " + currentNano);

        Map<String, String> getenv = System.getenv();

        getenv.forEach((key, value) -> System.out.println(key + " = " + value));

        System.out.println("Java version = " + System.getProperty("java.version"));

        char[] charArray = {'h', 'e', 'l', 'l', 'o'};

        char[] copiedArray = new char[5];

        System.arraycopy(charArray, 0, copiedArray, 0, charArray.length);

        for (char c : copiedArray) {
            System.out.println("c = " + c);
        }

        // 프로그램 종료
        System.exit(0); // 가급적 사용 X
    }
}
