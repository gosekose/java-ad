package object.enumeration.v3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();

        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("value.name() = " + value.name());
            System.out.println("value.ordinal() = " + value.ordinal());
        }

        // String -> Enum 변환
        String input = "GOLD";

        Grade grade = Grade.valueOf(input);

        System.out.println("grade = " + grade);
    }
}
