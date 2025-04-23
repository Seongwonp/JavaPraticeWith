package ch_07_method;

import java.util.Scanner;

public class My03 {
    /*
        입력받는 세 정수값의 최대값 구하기
        * 메서드는 어떤 입력을 받아 특정 연산을 수행한 뒤 결과를 변환하는 기능을한다.
     */

    static int getMax(int a, int b, int c){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 정수: ");
        int num2 = scanner.nextInt();
        System.out.print("세 번째 정수: ");
        int num3 = scanner.nextInt();

        int num_max = getMax(num1, num2, num3);
        System.out.println("최대값은 1" + num_max + "입니다.");

    }
}
