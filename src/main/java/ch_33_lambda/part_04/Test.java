package ch_33_lambda.part_04;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*
            람다 + Comparator 활용
            - Comparator.comparing()으로 정렬 기준을 간결하게 정의
            - thenComparing()으로 다중 정렬 기준 연결
         */

        List<String> fruits = Arrays.asList("banana", "apple", "kiwi", "cherry", "fig");

        // 람다로 정렬
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println("알파벳 오름차순: " + fruits);

        fruits.sort((a, b) -> b.compareTo(a));
        System.out.println("알파벳 내림차순: " + fruits);

        // Comparator.comparing + 메서드 참조
        fruits.sort(Comparator.comparing(String::length));
        System.out.println("길이 오름차순: " + fruits);

        // thenComparing: 같은 길이면 알파벳순
        fruits.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println("길이 → 알파벳: " + fruits);

        // 람다로 정의한 정렬 기준을 변수에 저장
        Comparator<String> byLengthDesc = Comparator.comparing(String::length).reversed();
        fruits.sort(byLengthDesc);
        System.out.println("길이 내림차순: " + fruits);
    }
}
