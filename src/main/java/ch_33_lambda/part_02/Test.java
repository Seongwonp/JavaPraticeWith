package ch_33_lambda.part_02;

import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        /*
            java.util.function 패키지의 표준 함수형 인터페이스 (Java 8+)

            Function<T,R>   : T 입력 → R 출력      apply(T t)
            Predicate<T>    : T 입력 → boolean 출력  test(T t)
            Consumer<T>     : T 입력 → 반환값 없음   accept(T t)
            Supplier<T>     : 입력 없음 → T 출력     get()
            BiFunction<T,U,R>: T,U 입력 → R 출력    apply(T t, U u)
         */

        // Function: 문자열 길이 반환
        Function<String, Integer> strLen = s -> s.length();
        System.out.println("\"Hello\" 길이: " + strLen.apply("Hello"));

        // Function 체이닝: andThen
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, String>  toStr    = x -> x + "원";
        Function<Integer, String>  combined = doubleIt.andThen(toStr);
        System.out.println("1000원 두 배: " + combined.apply(1000));

        // Predicate: 짝수 판별
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPos  = n -> n > 0;
        System.out.println("4 짝수?: " + isEven.test(4));
        System.out.println("4 짝수 AND 양수?: " + isEven.and(isPos).test(4));
        System.out.println("-4 짝수 OR 양수?: " + isEven.or(isPos).test(-4));

        // Consumer: 출력만 수행
        Consumer<String> printer   = s -> System.out.println("출력: " + s);
        Consumer<String> upperPrint = s -> System.out.println("대문자: " + s.toUpperCase());
        printer.andThen(upperPrint).accept("java lambda");

        // Supplier: 랜덤 숫자 생성
        Supplier<Double> randomGen = () -> Math.random() * 100;
        System.out.printf("랜덤값: %.2f%n", randomGen.get());

        // BiFunction: 두 수의 거듭제곱
        BiFunction<Integer, Integer, Double> power = (base, exp) -> Math.pow(base, exp);
        System.out.println("2^10 = " + power.apply(2, 10));
    }
}
