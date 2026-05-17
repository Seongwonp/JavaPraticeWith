package ch_34_stream.part_03;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        /*
            Optional<T> (Java 8+)
            - null을 직접 다루는 대신 Optional로 감싸서 NullPointerException 방지
            - 메서드가 "값이 없을 수 있음"을 명시적으로 표현
         */

        // Optional 생성
        Optional<String> present = Optional.of("Hello");
        Optional<String> empty   = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null); // null 허용

        // isPresent / isEmpty
        System.out.println("present: " + present.isPresent()); // true
        System.out.println("empty  : " + empty.isEmpty());     // true

        // get: 값이 없으면 NoSuchElementException → 직접 get보다는 아래 방법 권장
        System.out.println("값: " + present.get());

        // orElse: 값이 없으면 기본값 반환
        String result = empty.orElse("기본값");
        System.out.println("orElse: " + result);

        // orElseGet: 값이 없으면 Supplier 실행
        String result2 = empty.orElseGet(() -> "Supplier 기본값");
        System.out.println("orElseGet: " + result2);

        // orElseThrow: 값이 없으면 예외
        try {
            empty.orElseThrow(() -> new IllegalStateException("값 없음!"));
        } catch (IllegalStateException e) {
            System.out.println("예외: " + e.getMessage());
        }

        // map: 값이 있으면 변환, 없으면 empty 유지
        Optional<Integer> length = present.map(String::length);
        System.out.println("길이: " + length.orElse(0));

        // filter: 조건 불만족 시 empty
        Optional<String> filtered = present.filter(s -> s.startsWith("H"));
        System.out.println("필터: " + filtered.orElse("없음"));

        // ifPresent: 값이 있을 때만 실행
        present.ifPresent(s -> System.out.println("ifPresent: " + s));
    }
}
