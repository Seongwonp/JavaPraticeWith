package ch_07_method;

import java.util.Scanner;

public class Ex02 {
    /*
        학생 3명의 성적을 사용자로부터 입력받고,
        입력된 점수를 배열로 저장한 후 평균을 구해 출력하는 프로그램을 작성하세요.
        점수를 입력받는 부분과 평균을 구하는 부분은 메서드로 분리하세요.

        ex)
        학생 1의 점수를 입력하세요: 80
        학생 2의 점수를 입력하세요: 90
        학생 3의 점수를 입력하세요: 85
        평균 점수: 85.0
     */
    static final int Student_Num = 3;// 학생 수
    static final int Major_Num = 3;
    static final int Max_Score = 100;//만점
    static Scanner scanner = new Scanner(System.in);

    //학생 점수 입력
    static void studentInput(int[][] score){
        for(int i=0; i<Student_Num; i++){
            System.out.print("학생" + (i+1) + "의 점수를 입력하세요(국 영 수): ");
            for(int j=0; j<Major_Num; j++){
                score[i][j] = scanner.nextInt();
                if(score[i][j] < 0 || score[i][j] >Max_Score){
                    System.out.println("다시 입력하세요.");
                    j--;
                }
            }
        }
    }

    //평균구하기
    static double scoreAverage(int[][] score){
        int korea_sum = 0, english_sum = 0 , math_sum = 0, total_sum =0;
        for(int i=0; i<Student_Num; i++){
            korea_sum += score[i][0];
            english_sum += score[i][1];
            math_sum += score[i][2];
            for(int j=0; j<Major_Num; j++){
                total_sum += score[i][j];
            }
        }
        System.out.print("국어평균: " + (double)korea_sum/Student_Num + "   |   ");
        System.out.print("영어평균: " + (double)english_sum/Student_Num + "   |   ");
        System.out.println("수학평균: " + (double)math_sum/Student_Num + "      ");
        return (double)total_sum/Student_Num;
    }






    public static void main(String[] args) {
        int[][] score = new int[Student_Num][Major_Num];
        studentInput(score);
        double average = scoreAverage(score);
        System.out.println("전체 평균 점수: " + average);
    }
}
