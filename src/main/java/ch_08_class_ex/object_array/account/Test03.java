package ch_08_class_ex.object_array.account;

import java.util.Scanner;

public class Test03 {
    static final int COUNT_PEOPLE = 100;
    private static Scanner scanner = new Scanner(System.in);
    private static Account[] accounts = new Account[COUNT_PEOPLE];
    private static int idx = 0;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                isRun = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    //1. 계좌생성
    private static void createAccount() {
        String ano, owner;
        int balance;

        System.out.println("계좌번호를 입력하시오.");
        System.out.print(": ");
        ano = scanner.next();
        if (ano.isEmpty()) {
            System.out.println("ERROR");
            return;
        }
        System.out.print("계좌주: ");
        owner = scanner.next();
        if (owner.isEmpty()) {
            System.out.println("ERROR");
            return;
        }
        System.out.print("금액: ");
        balance = scanner.nextInt();
        if (balance < 0) {
            System.out.println("ERROR");
            return;
        }

        // 계좌 생성 후 리스트에 추가
        if (idx < accounts.length) {
            accounts[idx++] = new Account(ano, owner, balance); // 계좌를 추가하고 idx를 증가
            System.out.println("결과: 계좌가 생성되었습니다.");
            System.out.println(accounts[idx - 1]);
        } else {
            System.out.println("ERROR: 더 이상 계좌를 생성할 수 없습니다.");
        }
    }

    //2. 계좌목록
    private static void accountList() {
        // 계좌 목록을 출력할 때 idx를 활용하여 리스트에서 유효한 계좌만 출력
        for (int i = 0; i < idx; i++) {
            System.out.println((i + 1) + " : " + accounts[i]);
        }
    }

    private static Account findAccount(String ano) {
        for (int i = 0; i < idx; i++) {
            if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
                return accounts[i];
            }
        }
        System.out.println("결과: 계좌가 없습니다.");
        return null;
    }

    //3. 예금
    private static void deposit() {
        System.out.print("계좌번호를 입력하세요.: ");
        String ano = scanner.next();
        Account account = findAccount(ano);
        if (account != null) {
            System.out.print("예금 금액: ");
            int money = scanner.nextInt();
            if (money < 0) {
                System.out.println("ERROR");
                return;
            }
            account.setBalance(account.getBalance() + money);
            System.out.println("결과: 처리가 완료되었습니다");
            System.out.println(account);
        }
    }

    // 4.출금
    private static void withdraw() {
        System.out.print("계좌번호를 입력하세요.: ");
        String ano = scanner.next();
        Account account = findAccount(ano);
        if (account != null) {
            System.out.print("출금 금액: ");
            int money = scanner.nextInt();
            if (money < 0) {
                System.out.println("ERROR");
                return;
            }
            int newBalance = account.getBalance() - money;
            if (newBalance < 0) {
                System.out.println("결과: 잔액이 부족합니다.");
                return;
            }
            account.setBalance(newBalance);
            System.out.println("결과: 처리가 완료되었습니다");
            System.out.println(account);
        }
    }
}
