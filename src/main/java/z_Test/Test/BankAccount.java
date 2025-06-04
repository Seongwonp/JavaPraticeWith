package z_Test.Test;

abstract public class BankAccount implements IBankAccount {
    private String accountNumber; // 계좌번호
    private String accountHolder; // 계좌 소유주 이름
    private double balance; // 잔액

    protected BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌번호: " + accountNumber + " / 계좌 소유주 이름: " + accountHolder + " / 현재 잔액: " + balance;
    }


    @Override
    public boolean deposit(String accountNumber, double amount) {
        if (amount < 0) {
            System.out.println("-에러내용: 금액을 음수로 입력할수 없습니다!");
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(String accountNumber, double amount) {
        if (amount < 0) {
            System.out.println("-에러내용: 금액을 음수로 입력할수 없습니다!");
            return false;
        }
        if (balance < amount) {
            System.out.println("-에러내용: 잔액이 부족합니다!");
            return false;
        }
        balance -= amount;
        return true;
    }
}
