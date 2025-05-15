package ch_39_design_patton.part_06_mvc.banking;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Scanner;

@Log4j2
public class Controller {
    private final AccountService accountService = new AccountServiceImpl();
    private final Scanner scanner = new Scanner(System.in);


    public void run(){
        printMenu();
    }

    // 메인 메뉴를 출력하고 사용자 입력에 따라 각 기능을 실행하는 메서드
    private void printMenu(){
        while(true){
            int choice=0;
            System.out.println("\n=== Banking System ===");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 계좌 목록");
            System.out.println("5. 계좌 검색");
            System.out.println("6. 계좌 거래내역 검색");
            System.out.println("7. 종료");
            System.out.println("========================");
            System.out.print("Input: ");
            try{
                choice =  Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid input! Please enter a valid number.");
            }

            switch(choice){
                case 1 -> printCreateAccount();
                case 2 -> printDeposit();
                case 3 -> printWithdraw();
                case 4 -> printAccountList();
                case 5 -> printAccountSearch();
                case 6 -> printHistoryList();
                case 7 ->{
                    System.out.println("End of Program...");
                    return;
                }
                default -> System.out.println("Error: Wrong input value! Chose 1-6");
            }
        }
    }

    // 사용자로부터 계좌 정보를 입력받아 새 계좌를 생성하는 메서드
    private void printCreateAccount(){
        log.info("Create Account");
        AccountDTO account = new AccountDTO();
        System.out.print("Input Account ID: ");
        account.setAccountId(scanner.nextLine());
        System.out.print("Input Owner Name: ");
        account.setOwnerName(scanner.nextLine());

        if(accountService.addAccount(account)){
            System.out.println("Account Created Successfully!");
        } else{
            System.out.println("Account Creation Failed!");
        }
    }

    // 사용자로부터 입금할 계좌 ID와 금액을 입력받아 입금 처리하는 메서드
    private void printDeposit(){
        log.info("Deposit");
        int amount;
        System.out.print("Input Account ID: ");
        String accountId = scanner.nextLine();
        System.out.print("Input Amount: ");
        try {
            amount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }
        if(accountService.deposit(accountId, amount)){
            System.out.println("Deposit Successful!");
        } else{
            System.out.println("Deposit Failed!");
        }
    }

    // 사용자로부터 출금할 계좌 ID와 금액을 입력받아 출금 처리하는 메서드
    private void printWithdraw(){
        log.info("Withdraw");
        int amount;
        System.out.print("Input Account ID: ");
        String accountId = scanner.nextLine();
        System.out.print("Input Amount: ");
        try {
            amount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }
        if(accountService.withdraw(accountId, amount)){
            System.out.println("Withdraw Successful!");
        } else{
            System.out.println("Withdraw Failed!");
        }
    }

    // 등록된 모든 계좌의 정보를 출력하는 메서드
    private void printAccountList(){
        log.info("Account List");
        List<AccountDTO> accounts = accountService.listAccount();
        System.out.println("\n=========== Account List ===========");
        for(AccountDTO account : accounts){
            System.out.println("AccountID : " + account.getAccountId());
            System.out.println("OwnerName : " + account.getOwnerName());
            System.out.println("Balance : " + account.getBalance());
            System.out.println("CreatedAt : " + account.getCreatedAt() + "\n");
            System.out.println("====================================");
        }
    }

    // 사용자로부터 검색 기준과 키워드를 입력받아 해당 계좌를 검색하여 출력하는 메서드
    private void printAccountSearch(){
        log.info("Account Search");
        System.out.println("Choose Option 1) Account ID or 2) Owner Name");
        System.out.print("Input Option: ");
        int option =  Integer.parseInt(scanner.nextLine());
        switch(option){
            case 1: System.out.print("Input Account ID: ");
                    break;
            case 2: System.out.print("Input Owner Name: ");
                    break;
            default: System.out.println("Error: Wrong Number! Please enter 1 or 2.");
                    return;
        }
        String keyword = scanner.nextLine();
        List<AccountDTO> account = accountService.selectAccountBySearch(option, keyword);
        if(account != null && !account.isEmpty()) {
            System.out.println("\n=========== Account info ===========");
            for (AccountDTO acc : account) {
                System.out.println("AccountID : " + acc.getAccountId());
                System.out.println("OwnerName : " + acc.getOwnerName());
                System.out.println("Balance : " + acc.getBalance());
                System.out.println("CreatedAt : " + acc.getCreatedAt() + "\n");
                System.out.println("====================================");
            }
        }
    }


    private void printHistoryList(){
        log.info("Account History List");
        int i=1;
        System.out.print("Input Account ID: ");
        String id = scanner.nextLine();
        List<AccountHistoryDTO> account = accountService.listHistory(id);
        if(account != null && !account.isEmpty()){
            System.out.println("\n~~~~~~~~~~ Account History ~~~~~~~~~~");
            System.out.println("Account ID: " + id );
            for(AccountHistoryDTO acc : account){
                System.out.println("["+ i++ + "] 종류: "  + acc.getPart() + "| 금액: " + acc.getMoney() + "| 잔액: " + acc.getBalance() + "| 일시: " + acc.getCreatAt() + "\n");
            }
            System.out.println("====================================");
        } else{
            System.out.println("No History Found!");
        }
    }


}
