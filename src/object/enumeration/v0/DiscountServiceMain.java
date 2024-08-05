package object.enumeration.v0;

public class DiscountServiceMain {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discountPrice = discountService.discount("BASIC", price);
        System.out.println("discountPrice = " + discountPrice);

        discountPrice = discountService.discount("GOLD", price);
        System.out.println("discountPrice = " + discountPrice);

        discountPrice = discountService.discount("DIAMOND", price);
        System.out.println("discountPrice = " + discountPrice);
    }
}
