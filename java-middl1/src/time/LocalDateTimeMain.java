package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2025, 6, 12, 13, 30, 50);
        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(2025, 6, 12, 13, 30, 50);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)R
        LocalDateTime ofDtPlus = ofDt.plusDays(100);
        System.out.println("지정 날짜시간+1000d = "+ ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1000);
        System.out.println("지정 날짜시간+1년 = " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt)); //ofDt 지정날짜 시간 <- 현재 시산과 비교 nowDt.메서드
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt));
    }
}
