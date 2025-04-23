package ch_07_method;

import java.util.Arrays;
import java.util.Scanner;
public class Ex04 {
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
    static Scanner scanner = new Scanner(System.in);
    static int sum=0; //점수합계 저장
    static int[] scores = null;// 점수 배열

    //1
    static void numStudent(){
        int studentNum;
        System.out.print("학생수> ");
        studentNum = scanner.nextInt();
        scores = new int[studentNum];
        System.out.println(Arrays.toString(scores));
    }

    //2
    static void inputScore() {
        if(scores ==null){
            System.out.println("Error 학생수를 먼저 입력해주세요.");
            return;
        }
        for(int i=0; i<scores.length; i++){
            System.out.print("score[" + i + "]> ");
            scores[i] = scanner.nextInt();
            if(scores[i]<0 || scores[i]>100){
                System.out.println("Error");
                i--;
                continue;
            }
            sum+=scores[i];
        }
    }

    //3
    static void scoreList(){
        if(scores ==null){
            System.out.println("Error 리스트가 없습니다.");
            return;
        }
        for(int i=0; i<scores.length; i++){
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }

    //4
    static void scoreAnalysis(){
        if(scores ==null){
            System.out.println("Error 리스트가 없습니다.");
            return;
        }
        int max = scores[0];
        double avg;
        for(int i=1; i<scores.length; i++){
            if(scores[i]>max){
                max = scores[i];
            }
        }
        avg = (double)sum/scores.length;
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
    }

    //5
    static boolean off(){
        return false;
    }

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            switch (selectNo) {
                case 1:
                    numStudent();
                    break;
                case 2:
                    inputScore();
                    break;
                case 3:
                    scoreList();
                    break;
                case 4:
                    scoreAnalysis();
                    break;
                case 5:
                    flag = off();
                    break;
                default:
                    System.out.println("Error 옵션번호를 다시 입력하세요.");
            }
        }
        System.out.println("프로그램 종료");    }
}
