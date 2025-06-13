package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        //생성
//        Period period1 = Period.ofDays(10);
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용
//        LocalDate localDate = LocalDate.of(2025, 04, 05);
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
//      LocalDate plusDate =  localDate.plus(period)
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate);

        //기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
//        Period between1 = Period.between(startDate, endDate);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간: " + between.getMonths() +"개월 " + between.getDays() + "일");
    }
}
