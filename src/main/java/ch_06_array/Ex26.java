package ch_06_array;

import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        /*
        사용자가 입력한 숫자와 일치하는 요소가 배열에 존재하는지 여부를 검사하는 프로그램을 작성하세요.
        int[] arr  = {5,10,15,20,25};

        ex)
        검색할 숫자 입력: 17
        배열에 존재합니다.

        검사할 숫자 입력: 7
        배열에 존재하지 않습니다.
         */
        Scanner scanner = new Scanner(System.in);
        int[] arr  = {5,10,15,20,25};
        boolean flag = true, isNumber = false;
        System.out.println("검색할 숫자 입력하세요!(0입력시 종료됩니다)");
        while(flag){
            System.out.print("검색할 숫자 입력: ");
            int num = scanner.nextInt();
            if(num == 0){
                flag = false;
                break;
            }
            for(int i=0; i<arr.length; i++){
                if(num==arr[i]){
                    isNumber = true;
                    break;
                }else{
                    isNumber = false;
                }
            }
            if(isNumber){
                System.out.println("배열에 존재합니다.");
            }else{
                System.out.println("배열에 존재하지 않습니다.");
            }

        }
    }
}
