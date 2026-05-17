package ch_33_lambda.part_03;

import java.util.*;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        /*
            메서드 참조 (Method Reference)
            - 이미 정의된 메서드를 람다 대신 참조하는 간결한 문법
            - 종류:
              1. 정적 메서드 참조    : ClassName::staticMethod
              2. 인스턴스 메서드 참조 : instance::method
              3. 임의 인스턴스 참조   : ClassName::instanceMethod
              4. 생성자 참조         : ClassName::new
         */

        // 1. 정적 메서드 참조
        Function<String, Integer> parseInt = Integer::parseInt; // s -> Integer.parseInt(s)
        System.out.println("\"42\" → " + parseInt.apply("42"));

        // 2. 인스턴스 메서드 참조
        String prefix = "Hello, ";
        Function<String, String> greeter = prefix::concat;
        System.out.println(greeter.apply("World"));

        // 3. 임의 인스턴스 메서드 참조 (첫 번째 인자가 수신 객체)
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println(toUpper.apply("java"));

        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        // Comparator.comparing + 메서드 참조로 정렬
        names.sort(String::compareTo);
        System.out.println("정렬: " + names);

        // 4. 생성자 참조
        Supplier<ArrayList<String>> listFactory = ArrayList::new;
        ArrayList<String> newList = listFactory.get();
        newList.add("A");
        System.out.println("생성자 참조: " + newList);

        // forEach에서 메서드 참조
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.print("출력: ");
        nums.forEach(System.out::println); // n -> System.out.println(n)
    }
}
