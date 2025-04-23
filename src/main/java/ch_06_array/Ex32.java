package ch_06_array;

import java.util.Random;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int dice_number = rand.nextInt(6)+1;
        int answer = 0;
        int count =0;
        boolean flag = true;
        while(flag){
            System.out.print("주사위 값은 얼마일까요? >>> ");
            answer = scanner.nextInt();
            if(count ==2){
                dice_number = answer;
            }
            if(answer == dice_number){
                System.out.println(answer + "! 정답입니다.");
                flag = false;
                break;
            } else{
                System.out.println("오답입니다. 다시 시도하세요.");
                count++;
            }
        }
    }
}
