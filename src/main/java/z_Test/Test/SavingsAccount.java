package z_Test.Test;

public class SavingsAccount extends BankAccount {
    private double interestRate; //이자율

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public boolean deposit(String accountNumber, double amount) {
        if(!super.deposit(accountNumber, amount)){
            return false;
        }
        setBalance(getBalance() + amount * interestRate);
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " / 이자율: " + interestRate;
    }


}
