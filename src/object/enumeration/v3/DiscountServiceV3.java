package object.enumeration.v3;

public class DiscountServiceV3 {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
