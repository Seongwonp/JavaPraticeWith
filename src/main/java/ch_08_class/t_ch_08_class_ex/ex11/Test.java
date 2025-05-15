package ch_08_class.t_ch_08_class_ex.ex11;

import java.util.Scanner;

public class Test {
    /*
    while문과 Scanner를 이용해서 키보드로 입력된 데이터로 계좌생성, 계좌목록, 예금, 출금, 조회, 종료 기능을 제공하는 코드를 완성하세요.
    아래의 사항을 지켜 작업을 하세요
    1) main 메서드의 계좌생성, 계좌목록, 예금, 출금, 조회, 종료의 동작 구분은 switch로 작성.

    2) Account 클래스는 제공된 코드를 사용하고 수정하기 말것.

    3) 클래스 변수는 아래의 변수만 사용할 것.
    private static final int max = 3; // 허용가능한 계좌 개수
    private static final Account[] accounts = new Account[max]; // 객체 배열
    private static final Scanner scanner = new Scanner(System.in);
    private static int idx = 0; // 생성된 계좌 수

    4) 모든 코드의 for문은 idx를 사용할 것.

     */
    private static final int max = 3; // 허용가능한 계좌 개수
    private static final Account[] accounts = new Account[max]; // 객체 배열
    private static final Scanner scanner = new Scanner(System.in);
    private static int idx = 0; // 생성된 계좌 수

    public static void main(String[] args) {
        boolean isON = true;
        while (isON) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();
            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    viewAccount();
                    break;
                case 6:
                    isON = false;
                    break;
                default:
                    System.out.println("존제하지 않는 매뉴입니다. 다시 입력하세요.");
            }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }

    private static void createAccount(){
        /*
        계좌 생성을 위한 정보를 입력받고, Account 객체를 생성함.
        허용 가능한 통장의 개수 (max)이상의 통장을 개설하려는 경우에는 에러메시지를 출력하고 객체 생성을 하지 않음.
        반복문을 사용하지 말고 구현할 것.
         */
        String ano,owner;
        int balance;

        if (idx == max) {
            System.out.println("ERROR: 더 이상 계좌를 생성할 수 없습니다.");
            return;
        }

        System.out.print("계좌번호: ");
        ano = scanner.next();
        if (findAccount(ano) != null) {
            System.out.println("ERROR: 이미 존재하는 계좌번호입니다.");
            return;
        }
        System.out.print("계좌 주: ");
        owner = scanner.next();
        System.out.print("금액: ");
        balance = scanner.nextInt();
        accounts[idx++] = new Account(ano, owner, balance); // 계좌를 추가하고 idx를 증가
        System.out.println("결과: 계좌가 생성되었습니다.");
        System.out.println(accounts[idx - 1]);
    }


    private static void viewAccountList(){
        /*
          현재 개설된 전체 계좌 목록이 출력되도록 함.
          반복문에서는 idx를 사용할 것.
         */
        System.out.println("----------------------------------------------------------");
        System.out.println("                        계좌 목록                           ");
        System.out.println("----------------------------------------------------------");
        for(int i=0; i<idx; i++){
            if(accounts[i] != null){
                System.out.println("[" + (i+1) + "] : " + accounts[i]);
            }
        }
    }


    private static Account findAccount(String ano){
        /* 예금, 출금, 조회에서 해당 계좌번호를 찾는 코드는 따로 메서드화 시킴.*/
        for(int i=0; i<idx; i++){
            if(accounts[i].getAno().equals(ano)){
                return accounts[i];
            }
        }
        return null;
    }


    private static void deposit(){
        /*
         계좌번호와 입금액을 입력받고 해당 계좌번호의 잔액 증가 처리.
         0원이나 마이너스 금액을 입금하고자 하면 에러메시지가 나오고, 증가 처리를 하지 않음.
         해당 계좌번호가 없으면 에러메시지가 나옴.
         */

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        Account account = findAccount(ano);
        if(account==null){
            System.out.println("결과: 실패(계좌가 존재하지 않습니다.)");
            return;
        }
        System.out.print("입금 금액: ");
        int money = scanner.nextInt();
        if(money<=0){
            System.out.println("잘못입력하셨습니다.");
            return;
        }
        account.setBalance(account.getBalance()+money);
        System.out.println("결과: 처리완료");
        System.out.println("잔고:" + account.getBalance());

    }

    private static void withdraw(){
        /*
            계좌번호와 출금액을 입력받고 해당 계좌번호의 잔액 차감 처리.
            0원이나 마이너스 금액을 출금하고자 하면 에러메시지가 나오고, 차감 처리를 하지 않음.
            잔액보다 더 많은 금액을 출금하고자 하면 에러메시지가 나오고, 차감 처리를 하지 않음.
            해당 계좌번호가 없으면 에러메시지가 나옴.
         */
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        Account account = findAccount(ano);
        if(account==null){
            System.out.println("결과: 실패(계좌가 존재하지 않습니다.)");
            return;
        }
        System.out.print("출금 금액: ");
        int money = scanner.nextInt();
        if(money<=0){
            System.out.println("잘못입력하셨습니다.");
            return;
        }
        int newBalance = account.getBalance()-money;
        if(newBalance<0){
            System.out.println("결과: 실패(계좌에 잔액이 부족합니다.)");
            return;
        }
        account.setBalance(newBalance);
        System.out.println("결과: 처리완료");
        System.out.println("잔액:" + account.getBalance());
    }

    private static void viewAccount(){
        /*
            계좌번호를 입력받고 해당 계좌번호의 정보를 보여줌.
            해당 계좌번호가 없으면 에러메시지가 나옴.
         */
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        Account account = findAccount(ano);
        if(account==null){
            System.out.println("결과: 실패(계좌가 존재하지 않습니다.)");
            return;
        }
        System.out.println(account);
    }



}
