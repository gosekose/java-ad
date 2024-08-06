package lambda;

public class CalculableReturnMain {
    public static void main(String[] args) {
        CalculableReturn cal = Long::sum;

        CalculableReturn cal2 = (a, b) -> a * b;

        long cal1 = cal.cal(3, 6);
        long cal3 = cal2.cal(3, 6);

        System.out.println("cal1 = " + cal1);
        System.out.println("cal3 = " + cal3);

        // 메소드 참조
        CalculableReturn cal4 = MethodRef::sum;

        MethodRef ref = new MethodRef();

        CalculableReturn cal5 = ref::sum2;

        long cal6 = cal4.cal(3, 6);
        long cal7 = cal5.cal(3, 6);

        System.out.println("cal6 = " + cal6);
        System.out.println("cal7 = " + cal7);

    }
}
