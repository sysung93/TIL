package chapter11.API_Class15;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재시: " + now);

       /* LocalDateTime targetDateTime = now.plusYears(1);
        targetDateTime = targetDateTime.plusMonths(2);
        targetDateTime = targetDateTime.plusDays(3);
        targetDateTime = targetDateTime.plusHours(4);
        targetDateTime = targetDateTime.minusMinutes(5);
        targetDateTime = targetDateTime.plusSeconds(6);*/

        LocalDateTime targetDateTime = now
                .plusYears(1)
                .plusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .minusMinutes(5)
                .plusSeconds(6);

        System.out.println("연산후: " + targetDateTime);

    }
}
