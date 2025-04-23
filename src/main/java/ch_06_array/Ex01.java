package ch_06_array;

public class Ex01 {
    public static void main(String[] args) {
        //for문을 이용해서 arr배열의 합을 구하시오.

        int[] scores = {10,20,30,40,50};
        int sum =0;
        for(int i=0; i<scores.length; i++){
            sum+=scores[i];
        }
        System.out.println("sum= " + sum);
    }
}
