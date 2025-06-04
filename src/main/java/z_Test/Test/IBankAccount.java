package z_Test.Test;

public interface IBankAccount {
    boolean deposit(String accountNumber, double amount);
    boolean withdraw(String accountNumber, double amount);
}
