package ch_34_stream.t_ch_34_stream_ex.ex_01;

import java.util.*;
import java.util.stream.*;

// 연습: 직원 리스트 스트림 처리
public class Test {

    record Employee(String name, String dept, int salary) {}

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice",   "개발팀", 5000000),
            new Employee("Bob",     "영업팀", 4000000),
            new Employee("Charlie", "개발팀", 6000000),
            new Employee("Diana",   "인사팀", 3500000),
            new Employee("Eve",     "개발팀", 5500000),
            new Employee("Frank",   "영업팀", 4500000)
        );

        // 1. 개발팀 직원 이름 목록 (알파벳 순)
        List<String> devNames = employees.stream()
                .filter(e -> e.dept().equals("개발팀"))
                .map(Employee::name)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("개발팀: " + devNames);

        // 2. 전체 평균 연봉
        OptionalDouble avgSalary = employees.stream()
                .mapToInt(Employee::salary)
                .average();
        System.out.printf("평균 연봉: %,.0f원%n", avgSalary.getAsDouble());

        // 3. 부서별 평균 연봉
        System.out.println("\n부서별 평균 연봉:");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::dept,
                         Collectors.averagingInt(Employee::salary)))
                .forEach((dept, avg) -> System.out.printf("  %-6s: %,.0f원%n", dept, avg));

        // 4. 연봉 Top 3
        System.out.println("\n연봉 Top 3:");
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::salary).reversed())
                .limit(3)
                .forEach(e -> System.out.printf("  %-10s %,d원%n", e.name(), e.salary()));

        // 5. 연봉 450만원 이상인 직원이 있는지 확인
        boolean anyHighEarner = employees.stream().anyMatch(e -> e.salary() >= 4500000);
        System.out.println("\n450만원 이상 직원 존재: " + anyHighEarner);
    }
}
