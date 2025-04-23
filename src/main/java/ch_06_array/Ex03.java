package ch_06_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*

        키보드로 부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
        실행결과를 보고 알맞게 작성해 보세요.

        실행 예)
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 1
        학생수> 3
        [0, 0, 0]
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 2
        scores[0]> 90
        scores[1]> 80
        scores[2]> 70
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 3
        scores[0]: 90
        scores[1]: 80
        scores[2]: 70
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 4
        최고 점수: 90
        평균 점수: 80.0
        -----------------------------------------------------
        1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        -----------------------------------------------------
        선택> 5
        프로그램 종료
         */

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int studentNum=0;
        int[] scores = null;
        int sum=0;
        while (flag) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
                System.out.println(Arrays.toString(scores));
            } else if (selectNo == 2) {
                if(scores ==null){
                    System.out.println("Error");
                    continue;
                }
                for(int i=0; i<scores.length; i++){
                    System.out.print("score[" + i + "]> ");
                    scores[i] = scanner.nextInt();
                    sum+=scores[i];
                }
            } else if (selectNo == 3) {
                if(scores ==null){
                    System.out.println("Error");
                    continue;
                }
                for(int i=0; i<scores.length; i++){
                    System.out.println("score[" + i + "]: " + scores[i]);
                }
            } else if (selectNo == 4) {
                if(scores ==null){
                    System.out.println("Error");
                    continue;
                }
                int max = scores[0];
                double avg=0;
                for(int i=1; i<scores.length; i++){
                    if(scores[i]>max){
                        max = scores[i];
                    }
                }
                avg = (double)sum/scores.length;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else if (selectNo == 5) {
                flag = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
