package ch_33_lambda.t_ch_33_lambda_ex.ex_02;

import java.util.function.*;

// 연습: 함수 합성으로 간단한 텍스트 변환 파이프라인 구현
public class Test {
    public static void main(String[] args) {
        // 각 변환 단계를 Function으로 정의
        Function<String, String> trim       = String::trim;
        Function<String, String> toUpper    = String::toUpperCase;
        Function<String, String> addBracket = s -> "[" + s + "]";
        Function<String, Integer> toLength  = String::length;

        // andThen으로 파이프라인 연결
        Function<String, String> pipeline = trim.andThen(toUpper).andThen(addBracket);

        String input = "   hello world   ";
        System.out.println("입력: \"" + input + "\"");
        System.out.println("변환: " + pipeline.apply(input));

        // compose: andThen의 반대 (뒤에서 앞으로)
        Function<String, String> reversed = addBracket.compose(toUpper).compose(trim);
        System.out.println("compose: " + reversed.apply(input));

        // UnaryOperator: 입출력 타입이 같은 Function
        UnaryOperator<Integer> square  = x -> x * x;
        UnaryOperator<Integer> addTen  = x -> x + 10;
        Function<Integer, Integer> squareThenAdd = square.andThen(addTen);
        System.out.println("5의 제곱 + 10 = " + squareThenAdd.apply(5));
    }
}
