package ch_06_array;

import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        /*
           정수형 배열을 선언하고 사용자로부터 5개의 정수를 입력받아 배열에 저장한 뒤,
           배열에 저장된 숫자들의 합과 평균을 출력하세요.
           예) 숫자 입력: 10 20 30 40 50
           합계: 150
           평균: 30.0

           작업순서
           1. 사용할 변수 선언
           2. for 문을 이용해서 사용자에게 숫자를 입력
           3. foreach 문을 이용해서 합계를 구함
           4. 평균을 연산 후 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum =0;
        double avg;
        System.out.print("숫자 입력: ");
        for(int i=0; i<numbers.length ; i++){
            numbers[i] = scanner.nextInt();
        }
        for(int i : numbers){
            sum +=i;
        }
        avg = sum /(double)numbers.length;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
