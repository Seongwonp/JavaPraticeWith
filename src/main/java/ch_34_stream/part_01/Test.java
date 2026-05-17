package ch_34_stream.part_01;

import java.util.*;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        /*
            Stream API (Java 8+)
            - 컬렉션/배열 데이터를 선언형으로 처리하는 파이프라인
            - 중간 연산(intermediate): filter, map, sorted, distinct, limit, skip → 지연 실행
            - 최종 연산(terminal)   : forEach, collect, count, min, max, reduce → 실행 트리거
            - 스트림은 재사용 불가 (최종 연산 후 소멸)
         */

        List<Integer> nums = Arrays.asList(5, 3, 8, 1, 9, 2, 7, 4, 6, 3, 8);

        // filter: 조건에 맞는 요소만
        System.out.print("5 이상: ");
        nums.stream()
            .filter(n -> n >= 5)
            .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // map: 각 요소 변환
        System.out.print("제곱: ");
        nums.stream()
            .map(n -> n * n)
            .limit(5)
            .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // distinct + sorted
        System.out.print("중복제거 정렬: ");
        nums.stream()
            .distinct()
            .sorted()
            .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // skip + limit (페이징 개념)
        System.out.print("3개 건너뛰고 4개: ");
        nums.stream()
            .skip(3)
            .limit(4)
            .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // count
        long count = nums.stream().filter(n -> n > 5).count();
        System.out.println("5 초과 개수: " + count);
    }
}
