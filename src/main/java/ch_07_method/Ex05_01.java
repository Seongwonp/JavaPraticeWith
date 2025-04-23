package ch_07_method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05_01 {
        /*
    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 2
    계좌를 먼저 생성해 주세요.

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 1
    계좌가 생성되었습니다. 초기 잔액: 0원

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 2
    입금액> 5000
    입금 완료. 현재 잔액: 5000원

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 3
    출금액> 2000
    출금 완료. 현재 잔액: 3000원

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 4
    현재 잔액: 3000원

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 3
    출금액> 5000
    잔액이 부족합니다.

    -----------------------------------------------------
    1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료
    -----------------------------------------------------
    선택> 5
    프로그램 종료
     */

    static Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    static boolean isAccountCreated = false;
    static int money = 0;

    //계좌 개설 유무검사
    static boolean checkAccountCreated() {
        if (!isAccountCreated) {
            System.out.println("계좌를 먼저 생성해주세요.");
            return true;
        }
        return false;
    }
    //계좌 개설
    static void createAccount() {
        if (isAccountCreated) {
            System.out.println("이미 개설된 계좌가 있습니다. 삭제하고 새로 만드시겠습니까?(Y/N)");
            String answer = scanner.next();
            if (answer.equals("Y")) {
                money = 0;
                System.out.println("계좌가 생성되었습니다. 초기 잔액: " + money + "원");
            } else {
                System.out.println("초기 메뉴로 돌아갑니다.");
            }
        } else {
            isAccountCreated = true;
            System.out.println("계좌가 생성되었습니다. 초기 잔액: " + money + "원");
        }
    }
    //입금
    static void deposit() {
        if (checkAccountCreated()) return;
        System.out.print("입금액> ");
        int inputMoney = scanner.nextInt();
        if (inputMoney <0) {
            System.out.println("1원 이상으로 입력해주세요.");
            return;
        }
        money += inputMoney;
        System.out.println("입금 완료. 현재 잔액: " + money + "원");
    }
    //출금
    static void withdraw() {
        if (checkAccountCreated()) return;
        System.out.print("출금액> ");
        int outputMoney = scanner.nextInt();
        if (outputMoney <0) {
            System.out.println("1원 이상으로 입력해주세요.");
            return;
        }
        if (money < outputMoney) {
            System.out.println("잔액이 부족합니다.");
        } else {
            money -= outputMoney;
            System.out.println("출금 완료. 현재 잔액: " + money + "원");
        }
    }
    //잔액조회
    static void checkBalance() {
        if (checkAccountCreated()) return;
        System.out.println("현재 잔액: " + money + "원");
    }
    //프로그램 종료
    static void exitProgram() {
        flag = false;
        isAccountCreated = false;
        System.out.println("프로그램 종료");
    }
    //매인화면 출력
    static void mainMenu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("1.계좌생성 | 2.입금 | 3.출금 | 4.잔액조회 | 5.종료");
        System.out.println("-----------------------------------------------------");
        System.out.print("선택> ");
        int selectNo = scanner.nextInt();
            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    exitProgram();
                    break;
                default:
                    System.out.println("Error 옵션을 다시 선택하세요.");
        }
    } 
    public static void main(String[] args) {
        while (flag) {

            try {
                mainMenu();
            }catch (InputMismatchException e) {
                System.out.println("Error 옵션을 다시 선택하세요.");
                scanner.nextLine(); // 잘못된 입력 비우기
            }
        }
        scanner.close();
    }

}
