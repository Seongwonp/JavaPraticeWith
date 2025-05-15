package ch_11.step_02;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Test {
    public static void main(String[] args) {
        CompleteCalc calc = new CompleteCalc();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        calc.showInfo();
        log.info("add: " + calc.add(number1, number2));
        log.info("subtract: " + calc.subtract(number1, number2));
        log.info("times: " + calc.times(number1, number2));
        log.info("divide: " + calc.divide(number1, number2));

    }
}
