package ch_06_array;

public class Ex22 {
    public static void main(String[] args) {
        /*
            다음 배ㅕㅇㄹ에서 가장 큰 수와 가장 작은 수를 찾아 출력하는 프로그램을 작성하세요.
            int[] numbers = {45,22,78,10,55}

            작업 순서
            1. 변수 선언
            2. for문을 사용해서 최대값 출력
            3. for each 문을 사용해서 최소값 출력

         */


        int[] numbers= {45,22,78,10,55};
        int max = numbers[0];
        int min = numbers[0];

        for(int i=1 ; i<numbers.length ; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        for(int i : numbers){
            if(i<min){
                min = i;
            }
        }

        System.out.println("가장 큰 수: " + max);
        System.out.println("가장 작은 수: " + min);
    }
}
