package z_Test.v4;

public class BankService extends BankAccount{

    @Override
    public boolean addAccount(String accountId, String ownerName) {
        if(isDuplicatedAccount(accountId)) {
            return false;
        }
        AccountDTO account = new AccountDTO(accountId, ownerName);
        accounts.put(accountId, account);
        return true;
    }

    @Override
    public boolean deposit(String accountId, int amount) {
        AccountDTO account = accounts.get(accountId);
        if(account == null || amount < 0) {
            return false;
        }
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(String accountId, int amount) {
        AccountDTO account = accounts.get(accountId);
        if (account == null || amount > account.getBalance()) return false;
        account.setBalance(account.getBalance() - amount);
        return true;
    }

    @Override
    public void selectAccount(String accountId) {
        AccountDTO account = accounts.get(accountId);
        if (account == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return;
        }
        System.out.println("계좌번호: " + account.getAccountId());
        System.out.println("소유자: " + account.getOwnerName());
        System.out.println("잔액: " + account.getBalance());
    }

}
