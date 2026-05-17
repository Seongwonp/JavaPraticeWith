package ch_34_stream.t_ch_34_stream_ex.ex_02;

import java.util.*;
import java.util.stream.*;

// 연습: flatMap, Optional 체이닝
public class Test {
    public static void main(String[] args) {
        // flatMap: 중첩 리스트를 평탄화
        List<List<Integer>> nested = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> flat = nested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("flatMap: " + flat);

        // flatMap: 각 단어를 문자 단위로 분리 후 중복 제거
        List<String> words = Arrays.asList("Hello", "World", "Java");
        List<String> chars = words.stream()
                .flatMap(w -> Arrays.stream(w.split("")))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("고유 문자: " + chars);

        // Optional 체이닝
        Map<String, String> cityMap = Map.of(
            "Alice", "Seoul",
            "Bob",   "Busan"
        );

        Optional.ofNullable(cityMap.get("Alice"))
                .map(String::toUpperCase)
                .ifPresent(city -> System.out.println("Alice 도시: " + city));

        // 없는 키 → orElse
        String city = Optional.ofNullable(cityMap.get("Charlie"))
                .orElse("도시 정보 없음");
        System.out.println("Charlie 도시: " + city);
    }
}
