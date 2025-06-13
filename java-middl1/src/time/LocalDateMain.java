package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); // 오늘날짜 메서드
        LocalDate ofDate = LocalDate.of(2025, 6, 12); // 지정날짜 메서드
        System.out.println("오늘 날짜=" + nowDate);
        System.out.println("지정 날짜=" + ofDate);

        //계산(불변) 메서드
        ofDate = ofDate.plusDays(10); // 날짜를 추가해서 리턴
        System.out.println("지정 날짜+10d = " + ofDate);
    }
}
