package ch_39_design_patton.part_06_mvc.banking;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class AccountServiceImpl implements AccountService {
    Scanner scanner = new Scanner(System.in);
    AccountDAO accountDAO = new AccountDAOImpl();

    //계좌 생성
    // 새로운 계좌 정보를 받아서 중복 체크 후 계좌를 생성하는 메서드
    @Override
    public boolean addAccount(AccountDTO accountDTO) {
        if (accountDAO.IsDuplicatedAccount(accountDTO.getAccountId())) {
            System.out.println("This Account is already exist!");
            return false;
        }
        return accountDAO.insertAccount(accountDTO);
    }

    //계좌 검색
    // 검색 옵션과 키워드를 받아 계좌 ID나 소유자 이름으로 계좌 목록을 조회하는 메서드
    public List<AccountDTO> selectAccountBySearch(int option, String keyword) {
        List<AccountDTO> account = null;
        switch (option) {
            case 1:
                account = accountDAO.selectAccountBySearch("accountId", keyword);
                break;
            case 2:
                account = accountDAO.selectAccountBySearch("ownerName", keyword);
                break;
            default:
                break;
        }
        if (account == null || account.isEmpty()) {
            System.out.println("Account Not Found!");
            return null;
        }
        return account;
    }

    //리스트 출력
    // 모든 계좌의 리스트를 반환하는 메서드
    @Override
    public List<AccountDTO> listAccount() {
        return accountDAO.listAccount();
    }

    // 입금
    // 특정 계좌에 대해 입금 처리를 수행하는 메서드 (계좌 존재 여부와 금액 유효성 체크 포함)
    @Override
    public boolean deposit(String accountId, int amount) {

        List<AccountDTO> accounts = selectAccountBySearch(1, accountId); // 1: accountId, 2: ownerName
        if (accounts == null) {
            return false;
        }
        AccountDTO account = accounts.get(0);
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a positive number.");
            return false;
        }
        int newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
        System.out.println("Balance : " + newBalance);
        if(!addAccountHistory(account,amount,"입금")){
            System.out.println("Account History Insert Fail!");
            return false;
        }
        return accountDAO.updateBalance(accountId, newBalance);
    /*
            //case2
            int balance = selectAccountBySearch(1,accountId).get(0).getBalance();
            if(amount <= 0){
                System.out.println("Invalid amount! Please enter a positive number.");
                return false;
            }
            int newBalance = balance + amount;
            System.out.println("Balance : " + newBalance);
            return accountDAO.updateBalance(accountId, newBalance);
    */

    }

    //출금
    // 특정 계좌에 대해 출금 처리를 수행하는 메서드 (잔액과 금액 유효성 체크 포함)
    @Override
    public boolean withdraw(String accountId, int amount) {
        List<AccountDTO> accounts = selectAccountBySearch(1, accountId); // 1: accountId, 2: ownerName
        if (accounts == null) {
            return false;
        }
        AccountDTO account = accounts.get(0);
        if (amount > account.getBalance()) {
            System.out.println("Balance is not enough!");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a positive number.");
            return false;
        }
        int newBalance = account.getBalance() - amount;
        account.setBalance(newBalance);
        System.out.println("Balance : " + newBalance);
        addAccountHistory(account,amount,"출금");
        return accountDAO.updateBalance(accountId, newBalance);
    }


    //내역 추가
    @Override
    public boolean addAccountHistory(AccountDTO accountDTO, int money, String part){
        return accountDAO.insertAccountHistory(accountDTO, money, part);
    }

    @Override
    public List<AccountHistoryDTO> listHistory(String accountId) {
        return (accountDAO.listHistory(accountId)== null) ? null : accountDAO.listHistory(accountId);
    }

}
