package object.string.test;

public class TestString {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";

        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println("index = " + index);

        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }

        System.out.println("count = " + count);
    }
}
