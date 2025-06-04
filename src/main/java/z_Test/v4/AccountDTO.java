package z_Test.v4;

public class AccountDTO {
    private final String accountId;
    private final String ownerName;
    private int balance;

    AccountDTO(String accountId, String ownerName) {
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}