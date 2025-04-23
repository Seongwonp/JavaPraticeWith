package ch_06_array;

public class My04 {
    public static void main(String[] args) {
        int[] scores = {79,88,91,33,100,55,95};

        int max = scores[0];
        int min = scores[0];
        for(int i=1; i<scores.length; i++){
            if(scores[i]>max){
                max = scores[i];
            }
            if(scores[i]<min){
                min = scores[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
