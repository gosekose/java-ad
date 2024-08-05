package object.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 12, 11);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        System.out.println("formatter = " + formatter.format(date));
    }
}
