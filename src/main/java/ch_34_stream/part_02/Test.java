package ch_34_stream.part_02;

import java.util.*;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // reduce: 누적 연산 (초기값, BinaryOperator)
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("합계: " + sum);

        int product = nums.stream().reduce(1, (a, b) -> a * b);
        System.out.println("곱: " + product);

        // min, max → Optional 반환
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        System.out.println("최대: " + max.get() + ", 최소: " + min.get());

        // collect: Stream → List/Set/Map
        List<Integer> evens = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("짝수 List: " + evens);

        Set<Integer> oddSet = nums.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toSet());
        System.out.println("홀수 Set: " + oddSet);

        // joining: 문자열 스트림 연결
        List<String> words = Arrays.asList("Stream", "API", "Java", "8");
        String joined = words.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println("joining: " + joined);

        // mapToInt: 기본형 스트림 → sum, average, summaryStatistics
        IntSummaryStatistics stats = nums.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("통계: 합=" + stats.getSum()
                + " 평균=" + stats.getAverage()
                + " 최대=" + stats.getMax());
    }
}
