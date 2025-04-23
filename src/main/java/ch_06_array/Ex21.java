package ch_06_array;

public class Ex21 {
    public static void main(String[] args) {
        //길이가 5인 정수형 배열을 생성하고, 배열에 1부터 5까지 숫자를 저장한 후 이를 출력하세요.

        int[] num = new int[5];
        for(int i=0; i<5 ; i++){
            num[i] = i+1;
        }
        for(int j: num ){
            System.out.print(j + " ");
        }
    }
}
