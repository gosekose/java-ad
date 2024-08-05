package object.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // String result = "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
           //  result += "JAVA";
            sb.append("JAVA");
        }

        long end = System.currentTimeMillis();
        System.out.println("(end - start) = " + (end - start));
    }
}
