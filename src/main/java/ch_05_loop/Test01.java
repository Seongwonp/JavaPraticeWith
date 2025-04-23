package ch_05_loop;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer,num,i=0;
        num = random.nextInt(1000)+1;

        while(true){
            System.out.print("정답을 추측하여 보시오: ");
            answer = scanner.nextInt();
            if(answer==num) {
                System.out.println("축하합니다. 시도횟수 = " + i);
                break;
            } else{
                if(answer<num){
                    System.out.println("제시한 정수가 " + answer + "보다 높습니다.");
                }else {
                    System.out.println("제시한 정수가 " + answer + "보다 낮습니다.");
                }
                i++;
            }

        }
    }
}
