package z_Test.v2;

abstract public class BankAccount implements IBankAccount{
    private String accountId;
    private String accountName;
    private int balance;


    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
