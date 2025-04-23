package ch_03_operator;

public class My03 {
    public static void main(String[] args) {
        //증감연산자 ++ --
        int num1 = 30;
        System.out.println(num1--); //출력 후 감소 num1 -= 1
        System.out.println(num1);
        num1 = 30;
        System.out.println(--num1); //출력 전에 감소

        int num2 = 10;
        System.out.println(num2++); //출력 후 증가
        System.out.println(num2);
        num2 = 10;
        System.out.println(++num2); // 출력 전에 증가
    }
}
