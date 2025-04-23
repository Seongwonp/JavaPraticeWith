package ch_07_method;

import java.util.Scanner;

public class My02 {
    static final int People_Num = 3;//인원 수
    static Scanner scanner = new Scanner(System.in);

    //사용자로부터 데이터 입력
    static void inputData(int[] height, int[] weight, int[] age){
        for(int i=0; i<People_Num; i++){
            System.out.print("[" + (i+1) + "] ");
            System.out.print("신장: ");
            height[i] = scanner.nextInt();
            System.out.print("    체중: ");
            weight[i] = scanner.nextInt();
            System.out.print("    나이: ");
            age[i] = scanner.nextInt();
        }
    }

    //신장,체중,나이의 최대값 구하기
    static int getMax(int[] arr){
        int max =0;
        for(int i=0; i<People_Num; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        /*
            메서드는 왜 필요한가?
            입력받은  3명의 신장, 체중, 나이의 최대값을 구해서 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] height = new int[People_Num];
        int[] weight = new int[People_Num];
        int[] age    = new int[People_Num];

        //사용자로부터 데이터 입력
        inputData(height, weight, age);

        //신장,체중,나이 배열주소를 메소드에 대입
        int maxHeight = getMax(height);
        int maxWeight = getMax(weight);
        int maxAge = getMax(age);

        System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
        System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
        System.out.println("나이의 최대값은 " + maxAge + "입니다.");
        scanner.close();
    }
}
