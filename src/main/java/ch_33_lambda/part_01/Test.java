package ch_33_lambda.part_01;

// @FunctionalInterface: 추상 메서드가 딱 하나인 인터페이스 (람다로 표현 가능)
@FunctionalInterface
interface Greeting {
    String greet(String name);
}

@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}

public class Test {
    public static void main(String[] args) {
        /*
            람다식 (Lambda Expression)
            - 익명 함수를 간결하게 표현하는 문법 (Java 8+)
            - (매개변수) -> { 실행문 }
            - 함수형 인터페이스(추상 메서드 1개)의 인스턴스를 생성할 때 사용
         */

        // 기존 익명 클래스 방식
        Greeting oldStyle = new Greeting() {
            @Override
            public String greet(String name) {
                return "안녕하세요, " + name + "!";
            }
        };

        // 람다식으로 표현
        Greeting lambda = name -> "안녕하세요, " + name + "!";

        System.out.println(oldStyle.greet("홍길동"));
        System.out.println(lambda.greet("홍길동"));

        // 매개변수 2개
        Calculator add  = (a, b) -> a + b;
        Calculator mul  = (a, b) -> a * b;

        System.out.println("5 + 3 = " + add.calc(5, 3));
        System.out.println("5 * 3 = " + mul.calc(5, 3));

        // 블록 람다 (여러 줄)
        Calculator divSafe = (a, b) -> {
            if (b == 0) return 0;
            return a / b;
        };
        System.out.println("10 / 0 = " + divSafe.calc(10, 0));
        System.out.println("10 / 3 = " + divSafe.calc(10, 3));
    }
}
