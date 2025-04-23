package ch_06_array;

import java.util.Random;

public class My11_04 {
    public static void main(String[] args) {
        /*
            로또 번호 뽑기
            1~45번 번호의 공을 랜덤하게 6개를 뽑는다. 단, 중복은 허용하지않는다.
         */
        Random rand = new Random();
        int[] lotto = new int[6];
        int i = 0;
        //방법 1
        while (i < lotto.length) {
            int num = rand.nextInt(45) + 1;
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                lotto[i] = num;
                i++;
            }
        }

//        //방법2
//        for(int j=0; j<lotto.length ; j++){
//            lotto[j] = rand.nextInt(45)+1;
//            for(int k=0; k<j; k++){
//                if(lotto[j] == lotto[k] ){
//                    System.out.println(lotto[j] + " " + lotto[k]);
//                    System.out.println("중복된 값이 있습니다.");
//                      j--;
//                    break;
//                }
//            }
//        }

        for (int n : lotto) {
            System.out.print(n + " ");
        }
    }
}