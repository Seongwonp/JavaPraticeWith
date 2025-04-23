package ch_06_array;

import java.util.Random;

public class My11_03 {
    public static void main(String[] args) {
        //로또 번호 생성기
        Random rand = new Random();
        int[] nums = new int[45];
        for(int i=0 ; i<nums.length ; i++){
            nums[i] = i+1;
        }

        for(int i=0 ; i<6 ; i++){
            int idx = rand.nextInt(nums.length);
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }

        for(int i=0 ; i<6 ; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
