package object.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C").append("\n");

        String string = sb.toString();
        System.out.println("string = " + string);

        sb.insert(0, "JAVA");

        String string2 = sb.toString();
        System.out.println("string2 = " + string2);
    }
}
