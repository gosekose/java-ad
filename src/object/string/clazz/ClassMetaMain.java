package object.string.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {
    public static void main(String[] args) {
        Class<String> clazz = String.class;

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field.getType() = " + field.getType());
            System.out.println("field.getName() = " + field.getName());
        }
    }
}
