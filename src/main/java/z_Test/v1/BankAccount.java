package z_Test.v1;

import lombok.extern.log4j.Log4j2;

@Log4j2
abstract public class BankAccount implements IBankAccount{
    private final String accountNumber; //계좌 번호
    private final String owner; //예금주 이름
    private int balance; //잔액

    BankAccount(String accountNumber, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        log.info("deposit " + amount + " to " + owner);
    }

    @Override
    public boolean withdraw(int amount) {
        if(amount > balance){
            System.out.println("Balance is Not Enough:(");
            return false;
        }
        if(amount < 0){
            System.out.println("Amount is negative");
            return false;
        }
        balance -= amount;
        log.info("withdraw " + amount + " from " + owner);
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
