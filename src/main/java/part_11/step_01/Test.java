package part_11.step_01;

import lombok.extern.log4j.Log4j2;
import java.util.Scanner;
/*
    자바 7까지는 인터페이스에서 추상메서드와 상수, 이 두가지 요소만 선언해서 사용할 수 있음.
    그런데 하나의 인터페이스를 구현한 여러 클래스에서 동일한 기능의 메서드를 사용한다해서
    인터페이스에서 코드를 구현할 수 없으므로 추상 메서드를 선언하고
    각 클래스마다 똑같이 그 기능을 반복해서 구현해야 함.


    자바 8부터는 이런 부분에서 인터페이스 활용성을 높이기 위해 디폴트(default) 메서드와 정적(static) 메서드 기능을 제공.
    1) default 메서드는 인터페이서에서 구현 코드까지 작성한 메서드.
    인터페이스를 구현한 클래스에 기본적으로 제공할 메서드.
    인터페이스에서 구현하지만, 이 후 인터페이스를 구현한 클래스가 생성되면 그 클래스에서 사용할 기본 기능.
    2) static 메서드는 인스턴스 생성과 상관없이 사용할 수 있는 메서드.
    사용할 때는 인터페이스 이름으로 직접 참조하여 사용.


    자바 9부터는 인터페이스에 private 메서드를 구현할 수 있음.
    1) private 메서드는 인터페이스를 구현한 클래스에서 사용하거나 재정의할 수 없음.
    따라서 기존에 구현된 코드를 변경하지 않고 인터페이스를 구현한 클래스에서 공통으로 사용하는 경우에
    private 메소드를 사용하면 코드 재사용성을 높일 수 있음.
    또한 클라이언트 프로그램에 제공할 기본 기능을 private 메서드로 구현하기도 함.

 */



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

        //default 메소드
        calc.description();

//        calc.myMethod(); // private 메소드, 에러발생

        int[] arr = {1,2,3,4,5};
        System.out.println("static method " + Calc.total(arr)); // static 메소드 이기때문에 인터페이스에서 바로 호출


    }
}
