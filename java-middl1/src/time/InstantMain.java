package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        //생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt); // 꺼내온 UTC로 Zoned 출력
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(300400); // 기준일 + n
        System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600); // 변수 + seconds
        System.out.println("later = " + later);

        //조회
        long laterEpochSecond = later.getEpochSecond(); // 기준일 대비 흐른시간
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
