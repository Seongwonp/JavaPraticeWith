package ch_20_execution.divide_by_zero;
import java.util.Scanner;

 //0으로 나누기 예외 처리
public class DivideByZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        int num1, num2;

        try{
            System.out.print("Enter an integer1: ");
            num1 = in.nextInt();
            System.out.print("Enter an integer2: ");
            num2 = in.nextInt();
            result = num1 / num2;
        }catch (ArithmeticException e) {
            System.out.println();
            System.out.println("Exception: Divide by zero");
        }
        System.out.println("result: " + result);

    }
}
