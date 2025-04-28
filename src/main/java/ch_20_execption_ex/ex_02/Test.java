package ch_20_execption_ex.ex_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
            1. 사용자로부터 배열의 인덱스를 입력받고, 해당 인덱스에 저장된 값을 출력하는 프로그램을 작성하세요.
         */

        int[] scores = {90,67,88,74,32};
        int inputIndex = 0;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input Index Number: ");
            inputIndex = scanner.nextInt();
            System.out.println("Socre[" + inputIndex +"]: " + scores[inputIndex]);
        } catch(InputMismatchException e) {
            System.out.println("[Exception]: This is not Integer Type!!!");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("[Exception]: Array index out of bounds!!!");
        } catch (Exception e) {
            System.out.println("[Exception]: " + e);
        } finally {
            System.out.println("Process Done.");
        }

    }
}
