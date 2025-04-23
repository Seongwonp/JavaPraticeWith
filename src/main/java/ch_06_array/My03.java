package ch_06_array;

import java.util.Arrays;

public class My03 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 4, 25, 18};

        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7};

        int[] numbers3 = new int[10];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = i+1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
        System.out.println();

        //foreach문 사용
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int k : numbers2) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int j : numbers3) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Arrays.toString 매서드 사용
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers3));

        //stream() 사용
        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();
        Arrays.stream(numbers2).forEach(System.out::print);
        System.out.println();
        Arrays.stream(numbers3).forEach(System.out::print);


    }
}
