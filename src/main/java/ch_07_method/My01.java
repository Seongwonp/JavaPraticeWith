package ch_07_method;

import java.util.Scanner;
public class My01 { //인원 수
    public static void main(String[] args) {
        /*
            메서드는 왜 필요한가?
            입력받은  3명의 신장, 체중, 나이의 최대값을 구해서 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] height = new int[3];
        int[] weight = new int[3];
        int[] age    = new int[3];

        //사용자로부터 데이터 입력
        for(int i=0; i<3; i++){
            System.out.print("[" + (i+1) + "] ");
            System.out.print("신장: ");
            height[i] = scanner.nextInt();
            System.out.print("    체중: ");
            weight[i] = scanner.nextInt();
            System.out.print("    나이: ");
            age[i] = scanner.nextInt();
        }

        //신장,체중,나이의 최대값 구하기
        int maxHeight = height[0];
        if(height[1] > maxHeight){ maxHeight = height[1]; }
        if(height[2] > maxHeight){ maxHeight = height[2]; }

        int maxWeight = weight[0];
        if(weight[1] > maxWeight){ maxWeight = weight[1]; }
        if(weight[2] > maxWeight){ maxWeight = weight[2]; }
        int maxAge = age[0];
        if(age[1] > maxAge){ maxAge = age[1]; }
        if(age[2] > maxAge){ maxAge = age[2]; }

        System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
        System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
        System.out.println("나이의 최대값은 " + maxAge    + "입니다.");


        // My02 에서 간략화 시키기
    }
}
