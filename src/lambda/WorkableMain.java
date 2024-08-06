package lambda;

public class WorkableMain {
    public static void main(String[] args) {
        Workable workable = () -> System.out.println("args = " + args);
    }
}
