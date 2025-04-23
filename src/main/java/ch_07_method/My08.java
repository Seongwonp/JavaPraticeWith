package ch_07_method;

import java.util.Scanner;

public class My08 {
    /*
        return 기능
        1) 값을 반환
        2) 함수를 종료(반복무느이 break와 비슷)
     */

    static int getMax(int a, int b) {
        System.out.println("함수시작");
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }



    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();
        System.out.println("최대값은 " + getMax(a, b) + "입니다.");
        }
    }

