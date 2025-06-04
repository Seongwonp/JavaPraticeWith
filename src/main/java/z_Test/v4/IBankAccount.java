package z_Test.v4;

public interface IBankAccount{
    boolean addAccount(String accountId, String ownerName);
    boolean deposit(String accountId, int amount);
    boolean withdraw(String accountId, int amount);
    void selectAccount(String accountId);
    boolean isDuplicatedAccount(String accountId);
    void listAccounts();
}
