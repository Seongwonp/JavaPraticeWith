package z_Test.v4;

import java.util.*;

abstract public class BankAccount implements IBankAccount{
    protected Map<String, AccountDTO> accounts = new HashMap<>();

    @Override
    public boolean isDuplicatedAccount(String accountId) {
        return accounts.containsKey(accountId);
    }

    @Override
    public void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("등록된 계좌가 없습니다.");
            return;
        }
        for (AccountDTO account : accounts.values()) {
            System.out.println("계좌번호: " + account.getAccountId() +
                    ", 소유자: " + account.getOwnerName() +
                    ", 잔액: " + account.getBalance());
        }
    }
}
