package ch_07_method;

import java.util.Scanner;

public class My09 {

    static void divide(int a, int b){
        if(b == 0){
            System.out.println("0으론 나눌수없습니다.");
            return;
        }
        int result =a/b;
        System.out.println("결과: " + result);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();
        divide(a, b);
        System.out.println("main 메서드 종료");
    }
}
