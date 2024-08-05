package object.immutable.change;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!   ";

        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.isBlank() = " + str.isBlank());
        System.out.println(" = ".isBlank());
        System.out.println("str.charAt(0) = " + str.charAt(0));

        System.out.println("str.trim() = " + str.trim());
        System.out.println("str.startsWith(\"He\") = " + str.startsWith("He"));
        System.out.println("str.replace(\"Java\", \"JAVA\") = " + str.replace("Java", "JAVA"));
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        System.out.println("str.toLowerCase() = " + str.toUpperCase());

        System.out.println("str = ".compareTo("str"));
        System.out.println("str = ".equalsIgnoreCase("STR = "));

        System.out.println("str.substring(0, 5) = " + str.substring(0, 5));
        System.out.println("str.indexOf(\"Java\", 10) = " + str.indexOf("Java", 0));

        System.out.println("str = " + str.substring(3, 8));

        System.out.println("str.concat(\"hhh!!\") = " + str.concat("hhh!!"));
        System.out.println("str.replace(\"\") = " + str.replace("JAVA", "Java"));

        System.out.println("Java Java Java  ".replaceFirst("Java", "JAVA!#!@#"));
        System.out.println("  !! Java Java Java  !!".strip());
        System.out.println("  !! Java Java Java  !!".stripLeading());
        System.out.println("  !! Java Java Java  !!".stripIndent());
        System.out.println("  !! Java Java Java  !!".stripTrailing());

        String[] splitStr = "Java, Java, Apple".split(", ");
        for (String s : splitStr) {
            System.out.println("s = " + s);
        }

        String join = String.join(", ", splitStr);
        System.out.println("join = " + join);

        System.out.println("String.join(\"-\", splitStr); = " + String.join("-", splitStr));

        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String helloJava = "Hello, Java!";

        // toCharArray
        char[] strArr = helloJava.toCharArray();
        for (char c : strArr) {
            System.out.println("c = " + c);
        }
        System.out.println(String.format("num = %d, bool = %b, obj = %s, helloJava = %s", num, bool, obj, helloJava));;

        System.out.println(String.format("숫자: %.2f", 10.1234));

        String regex = "Hello, (Java!World)";
        System.out.println("regex.matches(\"Hello, (Java!World)\") = " + regex.matches("Hello, (Java!World)"));
    }
}
