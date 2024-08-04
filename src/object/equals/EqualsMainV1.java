package object.equals;

import java.util.Objects;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("1");
        UserV1 user2 = new UserV1("1");

        System.out.println(Objects.equals(user1.getId(), user2.getId()));
        System.out.println(user1.equals(user2));
    }
}
