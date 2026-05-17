package ch_36_datetime.part_01;

import java.time.*;

public class Test {
    public static void main(String[] args) {
        /*
            Java 8 신 날짜/시간 API (java.time 패키지)
            - 기존 Date/Calendar의 문제 해결: 불변(immutable), 스레드 안전, 직관적 API
            - LocalDate  : 날짜만 (연-월-일)
            - LocalTime  : 시간만 (시-분-초-나노)
            - LocalDateTime: 날짜 + 시간
         */

        LocalDate today = LocalDate.now();
        LocalTime now   = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        System.out.println("오늘 날짜: " + today);
        System.out.println("현재 시간: " + now);
        System.out.println("날짜+시간: " + dt);

        // 특정 날짜/시간 생성
        LocalDate birthday = LocalDate.of(2000, 3, 15);
        LocalTime meeting  = LocalTime.of(14, 30, 0);
        System.out.println("생일: " + birthday);
        System.out.println("미팅: " + meeting);

        // 날짜 연산 (불변 → 새 객체 반환)
        LocalDate nextWeek    = today.plusWeeks(1);
        LocalDate lastMonth   = today.minusMonths(1);
        LocalDate nextYear    = today.plusYears(1);
        System.out.println("다음 주: " + nextWeek);
        System.out.println("지난 달: " + lastMonth);

        // 날짜 정보 추출
        System.out.println("연도: " + today.getYear());
        System.out.println("월: " + today.getMonth() + " (" + today.getMonthValue() + ")");
        System.out.println("일: " + today.getDayOfMonth());
        System.out.println("요일: " + today.getDayOfWeek());
        System.out.println("올해 몇 번째 날: " + today.getDayOfYear());
        System.out.println("윤년?: " + today.isLeapYear());

        // 날짜 비교
        System.out.println("생일이 오늘 이전?: " + birthday.isBefore(today));
        System.out.println("내년이 오늘 이후?: " + nextYear.isAfter(today));
    }
}
