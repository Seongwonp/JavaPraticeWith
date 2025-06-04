package z_Test.v3;



import java.util.*;


public class AccountServiceImpl implements AccountService {
    final private AccountDAO accountDAO = new AccountDAOImpl();

    @Override
    public boolean createAccount(AccountDTO account) {
        if(accountDAO.IsDuplicatedAccount(account.getAccountId())){
            System.out.println("[ERROR] Account already exists!!");
            return false;
        }
        accountDAO.addAccount(account);
        return true;
    }

    @Override
    public List<AccountDTO> listAccount() {
        return (accountDAO.listAccounts() == null) ? null : accountDAO.listAccounts();
    }

    @Override
    public List<AccountDTO> searchAccount(String search, String value) {
        if(accountDAO.searchAccounts(search, value) == null){
            System.out.println("[ERROR] Account not found!!");
            return null;
        }
        return (accountDAO.searchAccounts(search, value));
    }

    private boolean updateAccount(String accountId, int amount, String op) {
        // 계좌 ID가 존재하는지 확인
        if(!accountDAO.IsDuplicatedAccount(accountId)){
            System.out.println("[ERROR] Can not Found account with id: " + accountId);
            return false;
        }

        // 입금 금액이 음수인지 검사
        if( amount < 0){
            System.out.println("Can't deposit negative amount! ");
            return false;
        }

        // 계좌 정보 조회
        List<AccountDTO> accounts = searchAccount("accountId", accountId);
        if(accounts == null){
            return false;
        }
        AccountDTO account = accounts.get(0);

        // 입금 또는 출금 처리
        switch(op){
            case "deposit":
                // 현재 잔액에 입금액을 더함
                amount += account.getBalance();
                break;
            case "withdraw":
                // 출금액이 잔액보다 많은지 확인
                if(amount > account.getBalance()){
                    System.out.println("Balance is not enough!");
                    return false;
                }
                // 현재 잔액에서 출금액을 뺌
                amount = account.getBalance() - amount;
                break;
        }

        // 계좌 정보 업데이트
        accountDAO.updateAccount(accountId, amount);
        System.out.println("Balance: " + amount);
        return true;
    }


    @Override
    public boolean deposit(String accountId, int amount) {
        return updateAccount(accountId, amount, "deposit");
    }

    @Override
    public boolean withdraw(String accountId, int amount) {
        return updateAccount(accountId, amount, "withdraw");
    }
}
