package ch_06_array;

import java.util.Random;
import java.util.Scanner;

public class My01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        //배열을 사용하지 않는 경우
        int score1 = 95;
        int score2 = 71;
        int score3 = 85;
        int score4 = 59;
        int score5 = 87;

        int total = score1 + score2 + score3 + score4 + score5;
        double avg = total/5.0;
        System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");

        total = 0;
        avg = 0;

        //배열을 사용하는 경우
        int[] scores = {95,71,85,59,87};
        for(int k = 0; k<scores.length; k++){
            total += scores[k];
        }
        avg = (double)total / scores.length;
        System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");
    }
}
