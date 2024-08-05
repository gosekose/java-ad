package object.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random(1);

        int i = random.nextInt();
        System.out.println("i = " + i);

        double v = random.nextDouble();
        System.out.println("v = " + v);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int i1 = random.nextInt(10);

        System.out.println("i1 = " + i1);

        int i2 = random.nextInt(10) + 1;
        System.out.println("1 ~ 10 = " + i2);
    }
}
