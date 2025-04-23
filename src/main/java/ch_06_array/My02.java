package ch_06_array;

public class My02 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[3];
        System.out.println(scores);

        System.out.println("현재 자동으로 초기화된 값: " + scores[0]);

        scores[0] = 30;
        scores[1] = 20;
        scores[2] = 10;
        System.out.println("현재 첫 번째 요소의 값: " + scores[0]);
    }
}
