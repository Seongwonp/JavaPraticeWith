package ch_20_execption_ex.ex_01;


import java.util.*;

public class Test {
    /*
        1. 사용자로부터 두 개의 정수를 입력 받아서 첫 번째 수를 두 번째 수로 나누는 프로그램을 작성하세요.
        2. 단 다음 상화엥 대한 예외처리를 반드시 하세요.
         - 0으로 나눌때 예외처리
         - 스케너 예외처리
         -그 외 알 수 없는 예외 발생처리

         3. 항상 프로그램이 비정상 종료되지 않도록 처리하고, 입력과 출력이 끝난 후에는 "Process Ended!" 출력.
     */
    public static void main(String[] args) {
        int num1, num2;
        double result;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter an integer2: ");
            num2 = scanner.nextInt();
            result = (double) num1 / num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("[Exception]: You entered an integer that is not an integer!!");
        } catch (ArithmeticException e) {
            System.out.println("[Exception]: Division by zero!!!");
        } catch (Exception e) {
            System.out.println("[Exception]: " + e);
        } finally {
            System.out.println("Process Ended!");
        }

    }
}
