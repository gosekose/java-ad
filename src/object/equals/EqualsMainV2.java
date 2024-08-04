package object.equals;

import java.util.Objects;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("1");
        UserV2 user2 = new UserV2("1");

        System.out.println(Objects.equals(user1.getId(), user2.getId()));
        System.out.println(user1.equals(user2));
    }
}
