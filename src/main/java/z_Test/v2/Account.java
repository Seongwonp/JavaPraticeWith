package z_Test.v2;

public class Account extends BankAccount{

    public Account(String accountId, String accountName) {
        setAccountId(accountId);
        setAccountName(accountName);
        setBalance(0);
    }


    @Override
    public void deposit(int amount) {
        if(amount < 0){
            System.out.println("Amount negative");
            return;
        }
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + " to " + getAccountName());
        System.out.println("Balance: " + getBalance());
    }

    @Override
    public boolean withdraw(int amount) {
        if(amount < 0 || amount > getBalance()){
            System.out.println("Amount negative");
            return false;
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdraw successful!");
        System.out.println("Balance: " + getBalance());
        return true;
    }

    @Override
    public void printBalance() {
        System.out.println("Balance: " + getBalance());
    }
}
