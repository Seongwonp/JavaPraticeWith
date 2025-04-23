package ch_06_array;

import java.util.Random;

public class My11_02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[10];
        for(int i=0 ; i<nums.length ; i++){
            nums[i] = i;
            System.out.print(nums[i] + " ");
        }
         System.out.println();
        for(int i=0 ; i<nums.length ; i++){
            int idx = rand.nextInt(nums.length);
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }

        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
