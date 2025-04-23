package ch_05_loop;

import java.util.Scanner;
public class Ex09 {
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
            if (menuNum == 1) {
                System.out.print("예금액> ");
                balance += scanner.nextInt();
            }else if(menuNum == 2){
                System.out.print("출금액> ");
                balance -= scanner.nextInt();
            }else if(menuNum == 3){
                System.out.println("잔고> " + balance);
            }
            if (menuNum == 4) {
                break;
            }
            /* 코드 종료 */
        }
        System.out.println("프로그램 종료");
        scanner.close();



    }
}
