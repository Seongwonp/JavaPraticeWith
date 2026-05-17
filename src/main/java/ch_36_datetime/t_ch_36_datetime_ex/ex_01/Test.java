package ch_36_datetime.t_ch_36_datetime_ex.ex_01;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

// 연습: 일정 관리 유틸리티
public class Test {

    record Schedule(String title, LocalDateTime startTime, int durationMinutes) {
        LocalDateTime endTime() { return startTime.plusMinutes(durationMinutes); }

        boolean isUpcoming() { return startTime.isAfter(LocalDateTime.now()); }

        String formatted() {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd(E) HH:mm");
            return String.format("%-15s %s ~ %s (%d분)",
                    title, startTime.format(fmt), endTime().format(fmt), durationMinutes);
        }
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        List<Schedule> schedules = List.of(
            new Schedule("팀 회의",       now.minusDays(1).withHour(10).withMinute(0), 60),
            new Schedule("점심 약속",      now.withHour(12).withMinute(30), 90),
            new Schedule("코드 리뷰",      now.plusDays(1).withHour(14).withMinute(0), 45),
            new Schedule("배포 미팅",      now.plusDays(2).withHour(16).withMinute(0), 30),
            new Schedule("주간 보고",      now.plusDays(7).withHour(9).withMinute(0), 120)
        );

        System.out.println("=== 전체 일정 ===");
        schedules.forEach(s -> System.out.println(s.formatted()));

        System.out.println("\n=== 예정 일정만 ===");
        schedules.stream()
                 .filter(Schedule::isUpcoming)
                 .sorted((a, b) -> a.startTime().compareTo(b.startTime()))
                 .forEach(s -> System.out.println(s.formatted()));

        // D-Day 계산
        LocalDate target = now.toLocalDate().plusDays(7);
        long dday = Period.between(now.toLocalDate(), target).getDays();
        System.out.println("\n주간 보고까지 D-" + dday);
    }
}
