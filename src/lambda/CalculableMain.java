package lambda;

public class CalculableMain {
    public static void main(String[] args) {

        Calculable cal = (a, b) -> {
            int c = a + b;
            System.out.println("c = " + c);
        };

        cal.calculate(10, 20);
    }
}
