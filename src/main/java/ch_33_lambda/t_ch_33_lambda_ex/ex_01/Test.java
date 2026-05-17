package ch_33_lambda.t_ch_33_lambda_ex.ex_01;

import java.util.*;
import java.util.function.*;

// 연습: 학생 리스트를 람다/함수형 인터페이스로 처리
public class Test {

    record Student(String name, int score) {}

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 88),
            new Student("Bob", 72),
            new Student("Charlie", 95),
            new Student("Diana", 65),
            new Student("Eve", 91)
        );

        // Predicate: 80점 이상
        Predicate<Student> highScore = s -> s.score() >= 80;

        // Consumer: 출력
        Consumer<Student> printer = s ->
            System.out.printf("%-10s %d점%n", s.name(), s.score());

        // Function: 등급 계산
        Function<Student, String> gradeOf = s -> {
            if (s.score() >= 90) return "A";
            if (s.score() >= 80) return "B";
            if (s.score() >= 70) return "C";
            return "D";
        };

        System.out.println("=== 80점 이상 학생 ===");
        students.stream()
                .filter(highScore)
                .sorted(Comparator.comparingInt(Student::score).reversed())
                .forEach(s -> System.out.printf("%-10s %d점 (%s)%n",
                        s.name(), s.score(), gradeOf.apply(s)));

        System.out.println("\n=== 전체 학생 등급 ===");
        students.forEach(s ->
            System.out.printf("%-10s → %s등급%n", s.name(), gradeOf.apply(s)));
    }
}
