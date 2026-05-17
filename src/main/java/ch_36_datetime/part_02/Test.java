package ch_36_datetime.part_02;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        /*
            DateTimeFormatter: 날짜/시간 ↔ 문자열 변환
            - 불변, 스레드 안전 (SimpleDateFormat의 thread-unsafe 문제 해결)
         */

        LocalDateTime now = LocalDateTime.now();

        // 미리 정의된 포맷
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // 커스텀 포맷 정의
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MM-dd (E)"); // 요일 포함

        System.out.println(now.format(fmt1));
        System.out.println(now.format(fmt2));
        System.out.println(now.format(fmt3));

        // 문자열 → LocalDate 파싱
        String dateStr = "2026-01-15";
        LocalDate parsed = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("파싱된 날짜: " + parsed);

        // Period: 날짜 간격 (년-월-일)
        LocalDate start = LocalDate.of(2000, 3, 15);
        LocalDate end   = LocalDate.now();
        Period period   = Period.between(start, end);
        System.out.printf("나이: %d년 %d개월 %d일%n",
                period.getYears(), period.getMonths(), period.getDays());

        // Duration: 시간 간격 (시-분-초-나노초)
        LocalTime t1 = LocalTime.of(9, 0);
        LocalTime t2 = LocalTime.of(17, 30);
        Duration duration = Duration.between(t1, t2);
        System.out.printf("근무 시간: %d시간 %d분%n",
                duration.toHours(), duration.toMinutesPart());
    }
}
