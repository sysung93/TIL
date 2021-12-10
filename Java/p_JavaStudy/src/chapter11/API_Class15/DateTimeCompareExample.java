package chapter11.API_Class15;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
        System.out.println("시작일: " + startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0,0);
        System.out.println("종료일: " + endDateTime + "\n");

        if(startDateTime.isBefore(endDateTime)) {
            System.out.println("진행 중 입니다.\n");
        } else if(startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다.\n");
        } else if(startDateTime.isAfter((endDateTime))){
            System.out.println("종료합니다.\n");
        }

        System.out.println();

        System.out.println("[종료까지 남은 시간]");
        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        System.out.println("남은 해: " + remainYear);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        System.out.println("남은 달: " + remainMonth);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        System.out.println("남은 일: " + remainDay);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        System.out.println("남은 시간: " + remainHour);
        long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        System.out.println("남은 분: " + remainMinute);
        long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("남은 일: " + remainSecond);

        System.out.println();

        remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
        System.out.println("남은 해: " + remainYear);
        remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
        System.out.println("남은 달: " + remainMonth);
        remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
        System.out.println("남은 일: " + remainDay);

        Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
        System.out.print("남은기간: " + period.getYears() + "년");
        System.out.print(period.getMonths() + "달");
        System.out.println(period.getDays() + "일");

       /* Duration duration = Duration.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
        System.out.println("남은 초: " + duration.getSeconds());*/




    }
}
