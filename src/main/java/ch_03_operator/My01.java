package ch_03_operator;

public class My01 {
    public static void main(String[] args) {
        /*
            산술 연산자
            변수 또는 ㅅ ㅏㅇ수와 함께 사용하여 기본적인 계산을 할 수 있음.
            나머지 연산자는 데이터 타입이 정수형인 경우에만 사용.
         */

        int num1 = 10;
        int num2 = 3;

        System.out.println(num1 + num2); //13
        System.out.println(num1 - num2); //7
        System.out.println(num1 * num2); //30
        System.out.println(num1 / num2); //3
        System.out.println(num1 % num2); //1

        System.out.println(num1 % 2); //0 (짝수)
        System.out.println(num2 % 2); //1 (홀수)

    }
}
