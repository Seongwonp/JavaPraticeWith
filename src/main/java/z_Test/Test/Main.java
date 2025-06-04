package z_Test.Test;

import java.util.*;

public class Main {
    private final Scanner scanner = new Scanner(System.in);
    private final List<BankAccount> accounts = new ArrayList<>();

    private void createAccount() {
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");
        int accountType;
        try {
            System.out.print("계좌종류: (1: 예금계좌, 2:  대출계좌): ");
            accountType = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요!");
            return;
        }
        if (accountType < 1 || accountType > 2) {
            System.out.println("1번, 2번 중에 선택해주세요!");
            return;
        }
        System.out.print("계좌번호: ");
        String accountId = scanner.nextLine();
        if (findAccount(accountId) != null) {
            System.out.println("계좌번호가 이미 존재합니다!!");
            return;
        }
        System.out.print("계좌주: ");
        String accountHolder = scanner.nextLine();
        if (accountType == 1) {
            double interestRate;
            try {
                System.out.print("이자율: ");
                interestRate = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 숫자만 입력해주세요!");
                return;
            }
            double balance;
            try {
                System.out.print("초기입금액: ");
                balance = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 숫자만 입력해주세요!");
                return;
            }
            BankAccount savingsAccount = new SavingsAccount(accountId, accountHolder, balance, interestRate);
            accounts.add(savingsAccount);
            System.out.println("결과: 계좌가 생성되었습니다.");
        } else {
            double chargeRate;
            try {
                System.out.print("수수료율: ");
                chargeRate = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 숫자만 입력해주세요!");
                return;
            }
            double balance;
            try {
                System.out.print("초기대출액: ");
                balance = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 숫자만 입력해주세요!");
                return;
            }
            BankAccount checkingAccount = new CheckingAccount(accountId, accountHolder, balance, chargeRate);
            accounts.add(checkingAccount);
            System.out.println("결과: 계좌가 생성되었습니다.");
        }


    }

    private void viewAccountList() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }

    private void deposit() {
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String accountId = scanner.nextLine();
        BankAccount account = findAccount(accountId);
        if (account == null) {
            System.out.println("계좌번호가 존재하지 않습니다!");
            return;
        }
        double amount;
        try {
            System.out.print("예금액: ");
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요!");
            return;
        }
        if (account.deposit(account.getAccountNumber(), amount)) {
            System.out.println("결과: 예금이 성공되었습니다.");
        } else {
            System.out.println("[ERROR]: 예금 실패하였습니다.");
        }
    }

    private void withdraw() {
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String accountId = scanner.nextLine();
        BankAccount account = findAccount(accountId);
        if (account == null) {
            System.out.println("계좌번호가 존재하지 않습니다!");
            return;
        }
        double amount;
        try {
            System.out.print("출금액: ");
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요!");
            return;
        }
        if (account.withdraw(account.getAccountNumber(), amount)) {
            System.out.println("결과: 출금이 성공되었습니다.");
        } else {
            System.out.println("[ERROR]: 출금 실패하였습니다.");
        }
    }

    private void viewAccount() {
        System.out.println("--------------");
        System.out.println("조회");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String accountId = scanner.nextLine();
        BankAccount account = findAccount(accountId);
        if (account == null) {
            System.out.println("계좌번호가 존재하지 않습니다!");
            return;
        }
        System.out.println(account);

    }

    private BankAccount findAccount(String accountId) {
        for (BankAccount account : accounts) {
            if (accountId.equals(account.getAccountNumber())) {
                return account;
            }
        }
        return null;
    }

    private void runMenu() {
        int option;
        boolean flag = true;
        while (flag) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 숫자만 입력해주세요!");
                continue;
            }
            switch (option) {
                case 1 -> createAccount();
                case 2 -> viewAccountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> viewAccount();
                case 6 -> {
                    System.out.println("End of program....");
                    flag = false;
                    return;
                }
                default -> System.out.println("[ERROR] Wrong option!");
            }
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.runMenu();
    }
}
