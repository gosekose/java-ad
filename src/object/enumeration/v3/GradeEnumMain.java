package object.enumeration.v3;

public class GradeEnumMain {
    public static void main(String[] args) {
        int price = 10000;

        DiscountServiceV3 discountService = new DiscountServiceV3();
        int discountPrice = discountService.discount(Grade.BASIC, price);
        System.out.println("discountPrice = " + discountPrice);

        discountPrice = discountService.discount(Grade.GOLD, price);
        System.out.println("discountPrice = " + discountPrice);

        discountPrice = discountService.discount(Grade.DIAMOND, price);
        System.out.println("discountPrice = " + discountPrice);
    }
}
