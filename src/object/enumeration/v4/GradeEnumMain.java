package object.enumeration.v4;

import static object.enumeration.v4.Grade.*;

public class GradeEnumMain {
    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();

        for (Grade grade: grades) {
            System.out.println("discountPrice = " + grade.discount(price));
        }
    }
}
