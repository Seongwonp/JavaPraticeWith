package ch_05_loop;

import java.util.Scanner;

public class Ex09_01 {
    public static void main(String[] args) {
        /*
            while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 완성하세요.
            프로그램을 실행하면 다음과 같은 실행 결과가 나와야 합니다. (Scanner의 nextLine() 사용).

            실행 예
            -------------------------------------
            1. 예금 | 2.출금 | 3.잔고 | 4.종료
            -------------------------------------
            선택> 1
            예금액> 10000

            -------------------------------------
            1. 예금 | 2.출금 | 3.잔고 | 4.종료
            -------------------------------------
            선택> 2
            출금액> 2000

            -------------------------------------
            1. 예금 | 2.출금 | 3.잔고 | 4.종료
            -------------------------------------
            선택> 3
            잔고> 8000

            -------------------------------------
            1. 예금 | 2.출금 | 3.잔고 | 4.종료
            -------------------------------------
            선택> 4

            프로그램 종료

            추가 수정
            1) 메뉴관련 처리를 switch로 변경
            2) 메뉴에서 1~4 외의 숫자를 입력하면 "잘못된 메뉴입니다."를 출력
            3) 출금 금액이 잔액보다 클 경우 "잔액이 부족합니다."를 출력하고 잔액은 변경되지 않도록 수정
            4) 출금 시 음수나 0원을 입력하면 "올바른 금액을 입력하세요."가 출력되도록 수정
         */
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        while (run) {

            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");

            /* 코드 시작 */
            int menuNum = scanner.nextInt();
            switch (menuNum){
                case 1:
                    System.out.print("예금액> ");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int amount = scanner.nextInt();
                    if(amount > balance){
                        System.out.println("잔액이 부족합니다.");
                    } else if(amount <= 0){
                        System.out.println("올바른 금액을 입력하세요.");
                    } else{
                        balance -= amount;
                    }
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다.");

            }
            /* 코드 종료 */
        }
        System.out.println("프로그램 종료");
        scanner.close();



    }
}
