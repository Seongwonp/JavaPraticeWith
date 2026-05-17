package ch_36_datetime.part_03;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        /*
            ZonedDateTime : 타임존(TimeZone) 포함 날짜/시간
            Instant       : Unix 타임스탬프 (1970-01-01 기준 경과 시간)
         */

        // 서울 시간
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulTime = ZonedDateTime.now(seoulZone);
        System.out.println("서울: " + seoulTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

        // 뉴욕 시간
        ZoneId nyZone = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(nyZone);
        System.out.println("뉴욕: " + nyTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

        // UTC
        ZonedDateTime utcTime = seoulTime.withZoneSameInstant(ZoneOffset.UTC);
        System.out.println("UTC : " + utcTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

        // Instant: 시스템 타임스탬프 (DB 저장/API 통신에 주로 사용)
        Instant now = Instant.now();
        System.out.println("Instant: " + now);
        System.out.println("에포크 초: " + now.getEpochSecond());

        // Instant ↔ LocalDateTime 변환
        LocalDateTime ldt = LocalDateTime.ofInstant(now, seoulZone);
        System.out.println("Instant → 서울 LocalDateTime: " + ldt);

        // 사용 가능한 타임존 목록 (일부 출력)
        System.out.println("\n아시아 타임존:");
        ZoneId.getAvailableZoneIds().stream()
              .filter(z -> z.startsWith("Asia"))
              .sorted()
              .limit(5)
              .forEach(z -> System.out.println("  " + z));
    }
}
