package ch_06_array;

public class My21 {
    public static void main(String[] args) {
        //1.기본형 값 비교
        int num1 = 5;
        int num2 = 5;

        if(num1 == num2) {
            System.out.println("두개의 값이 같습니다.");
        } else {
            System.out.println("두개의 값이 다릅니다.");
        }

        //2. 참조형 값 비교
        int[] numbers1 = new int[] {1,2,3};
        int[] numbers2 = new int[] {1,2,3};

        if(numbers1 == numbers2) {
            System.out.println("두개의 참조가 같습니다.");
        }else{
            System.out.println("두개의 참조가 다릅니다.");
        }
        System.out.println(numbers1);
        System.out.println(numbers2);

        if(numbers1[2] == numbers2[2]) {
            System.out.println("두개의 값이 같습니다.");
        } else {
            System.out.println("두개의 값이 다릅니다.");
        }

        //3. 기본형 복사
        int num3 = num2;
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("\n\n");

        //4. 참조형 복사
        int[] numbers3 = numbers2;
        System.out.println(numbers2[2]);
        System.out.println(numbers3[2]);

        numbers3[2] = 10;
        System.out.println(numbers2[2]);
        System.out.println(numbers3[2]);

    }
}
