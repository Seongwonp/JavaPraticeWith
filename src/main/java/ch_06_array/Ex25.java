package ch_06_array;

public class Ex25 {
    public static void main(String[] args) {
        /*
            정수 배열의 내용을 거꾸로 뒤집어 출력하는 프로그램을 작성하세요.
            int[] arr = {1,2,3,4,5};
         */
        int[] arr = {1,2,3,4,5};
        for(int i = arr.length-1 ; i>=0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
