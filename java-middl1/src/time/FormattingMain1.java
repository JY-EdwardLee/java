package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {
        // 포맷팅: 날짜를 문자로
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy냥 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDate);

        // 파싱: 문자를 날짜로 (위에 포매터로 생성할 때 형식과 같아야함)
        String input = "2030냥 01월 01일";// 뽑아서 데이터로 만듬
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDate);
    }
}
