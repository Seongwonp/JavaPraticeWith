package ch_06_array;

public class My06 {
    public static void main(String[] args) {
        //숫자 셔플
        int[] numbers = new int[10];

        for(int i=0 ; i<numbers.length ; i++){
            numbers[i]=i;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for(int i=0 ; i<numbers.length ; i++){
            int idx = (int)(Math.random()*numbers.length);
            int temp = numbers[idx];
            numbers[idx] = numbers[i];
            numbers[i] = temp;
        }

        for(int i=0 ; i<numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
