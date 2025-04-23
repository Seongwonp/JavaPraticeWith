package ch_03_operator;

public class My02 {
    public static void main(String[] args) {
        //복합 대입 연산자 += -= *= /= %=

        int num1 = 3;
        int num2 = 5;

        System.out.println(num2); //5
        num2 = num1;
        System.out.println(num2); //3
        num2+= num1; // num2 = num2 + num1
        System.out.println(num2); //6
        num2 -= num1; // num2 = num2 - num1
        System.out.println(num2); //3
        num2 *= num1; // num2 = num2 * num1
        System.out.println(num2); //9
        num2 /= num1; // num2 = num2 / num1
        System.out.println(num2); //3
        num2 %= num1; // num2 = num2 % num1
        System.out.println(num2); //0


    }
}
