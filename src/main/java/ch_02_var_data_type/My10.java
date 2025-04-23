package ch_02_var_data_type;

//import java.util.*;

public class My10 {
    public static void main(String[] args) {
        /*
            계산시 형변환
            ->정수와 정수의 연산의 결과 값은 정수. 정수와 실수 연산의 결과 값은 실수
         */

        //국영수 점수의 평균을 구함.
        int kor, math, eng, total;
        double average;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("국어성적을 입력하시오.: ");
//        kor = sc.nextInt();
//       System.out.print("수학성적을 입력하시오.: ");
//        math = sc.nextInt();
//       System.out.print("영어성적을 입력하시오.: ");
//        eng = sc.nextInt();
        kor = 55;
        math = 99;
        eng = 87;
        // 총점: 241
        // 평균: 80.333333333
        total = kor + math + eng;
        int avg_01 = total/3;
        double avg_02 = total/3; //->정수 연산으로 정수 값이 나온 후에 실수에 저장.
        average = (double)total / 3;
        System.out.println("총점: " + total);
        System.out.println("avg_01: " + avg_01);
        System.out.println("avg_02: " + avg_02);
        System.out.println("평균: " + average);


    }
}
